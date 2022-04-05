package game_package;

import java.util.Scanner;

import command_package.invoker;
import interceptor_package.ConcreteAttackInterceptor;
import interceptor_package.Dispatcher;
import map_package.Map;
import memento_package.Memento;
import player_package.Player;
import room_package.RoomFactory;
import testing_package.AutomatedTesting;

public class Game {
	
	// RoomFactory roomFactory = new RoomFactory();
	// //Get Ayoub to have a look at this
	static Player player;
	//  //Add check to see if player chose easy or hard map then generate
	static Map map;
	invoker commandInvoker = new invoker();
	
	
	
	
	
	//Need to create dispatcher object here I think
	//This then keep track of any interceptors that may apply so when the command
	//Is given to attack the new interceptor is added to the list
	//Then the dispatcher runs through the list of interceptors and applys them
	//using the provided context object
		
		
	// }

	public static void main(String[] args){
		
		//Instance of dispatcher fetched and registers the concrete attack interceptor
		Dispatcher dispatcher = Dispatcher.getInstance();
		ConcreteAttackInterceptor interceptor = new ConcreteAttackInterceptor();
		dispatcher.register(interceptor);

		AutomatedTesting tester = new AutomatedTesting();
		// tester.testItemBuilder();
		// tester.testPlayerBuilder();
		// tester.testComposite();
		tester.testFlyweight();

	// 	InitGame game = new InitGame();
	// 	game.printWelcomeMessage();
	// 	player = game.init();
	// 	String map = game.getMapType();
	// 	game.printGuidelines();
	// 	game.printMap(map);

	//     }

	//    public static Memento createMemento() {
		
	//     Memento memento = new Memento(player, map);
	// 	return memento;
	//    }
	
	//    public static void restoreMemento(Memento m) {
		
	// 	   player = m.player;
	// 	   map = m.map;
		
	//    }
	}
	
}


