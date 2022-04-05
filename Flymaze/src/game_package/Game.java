package game_package;

import java.util.Scanner;

import command_package.invoker;
import command_package.showMapCommand;
import interceptor_package.ConcreteAttackInterceptor;
import interceptor_package.Dispatcher;
import map_package.Map;
import map_package.MapFactory;
import memento_package.Caretaker;
import memento_package.Memento;
import player_package.Player;
import testing_package.AutomatedTesting;

public class Game {
	
	static Player player;
	static Map map;

	public static void main(String[] args){
		
		MapFactory mapFactory = new MapFactory();
		boolean gameOver = false;
		invoker commandInvoker = new invoker();
		
		//Instance of dispatcher fetched and registers the concrete attack intercepter
		Dispatcher dispatcher = Dispatcher.getInstance();
		ConcreteAttackInterceptor interceptor = new ConcreteAttackInterceptor();
		dispatcher.register(interceptor);
		
		Caretaker caretaker = new Caretaker();
		caretaker.captureMemento();
		

		

	 	InitGame game = new InitGame();
	 	game.printWelcomeMessage();
		game.mainMenu();

	 	Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a number...");

        int input = sc.nextInt();
        if (input == 1){

            player = game.init();
			String mapLevel = game.getMapType();
			map = mapFactory.getMap(mapLevel);
			map.populateRooms();
			map.populateRoomExits();
			map.generateMapString();
			showMapCommand mapCommand = new showMapCommand(map);
			commandInvoker.setCommand(mapCommand);
			
			game.printGuidelines();
			commandInvoker.commandInvoked();
			
			while(!gameOver){
				game.play(commandInvoker, player, map);
				//If player dies the game is restored to the beginning by Caretaker
				if(player.getHealth()<0) {
					caretaker.restoreBackup();
				}
			}

        } else if (input == 2){
            game.automatedTestingOption();
        } else {
            System.out.println("Enter either 1 or 2...");
			System.out.println("Please restart the game.");
        }
		
	}
	
	 public static Memento createMemento() {
	     Memento memento = new Memento(player, map);
	 	return memento;
	 }
	
	 public static void restoreMemento(Memento m) {
		 player = m.player;
	 	 map = m.map;
	 }
	
}


