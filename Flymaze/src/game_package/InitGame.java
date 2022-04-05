package game_package;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import command_package.invoker;
import command_package.moveCommand;
import command_package.pickUpCommand;
import command_package.showMapCommand;
import command_package.usePotionCommand;
import interceptor_package.AttackContext;
import interceptor_package.ConcreteAttackInterceptor;
import interceptor_package.Dispatcher;
import items_package.Items;
import map_package.Map;
import player_package.Player;
import testing_package.AutomatedTesting;

public class InitGame {

    public void printWelcomeMessage(){
        System.out.println("\n       Welcome to FlyMaze!");

        System.out.println("\nYou just got dropped into the maze...");
    }

    public void printGuidelines(){
        System.out.println("\n----------------Game Instructions----------------");
        System.out.println("\n Type one of the following");
        System.out.println("MOVE [NORTH, SOUTH, EAST, WEST] -> To change rooms");
        System.out.println("MAP -> Display map");
        System.out.println("INVENTORY -> Display Inventory");
        System.out.println("PICKUP SWORD -> To pickup Sword item");
        System.out.println("PICKUP POTION -> To pickup Potion found item");
        System.out.println("USE -> To use health potion");
        System.out.println("ATTACK -> To attack enemy");
        System.out.println("HELP -> View these instructions again");
        System.out.println("-------------------------------------------------\n");
    }

    public void mainMenu(){
        System.out.println("\n--------Main Menu--------");
        System.out.println("Select an option:");
        System.out.println("1) START GAME");
        System.out.println("2) Run Automated Tests");
    }

    public void automatedTestingOption(){
        AutomatedTesting tester = new AutomatedTesting();
		tester.testItemBuilder();
		tester.testPlayerBuilder();
		tester.testComposite();
		tester.testFlyweight();
        System.out.println("Please restart the game.");
    }

    public Player init(){
        Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter your first name:");
        while(!sc.hasNext()){
            System.out.println("Please enter your first name:");
            sc.nextLine();
        }
        String firstName = sc.nextLine();

        System.out.println("Enter your middle name (Press enter to skip):");
        String middleName = sc.nextLine();

        System.out.println("Enter your last name (Press enter to skip):");
        String lastName = sc.nextLine();

        System.out.println("Enter your gender (Press enter to skip):");
        String gender = sc.nextLine();

        System.out.println("Enter your email address (Press enter to skip):");
        String email = sc.nextLine();

        System.out.println("Whats your favorite colour? (Press enter to skip):");
        String colour = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        // sc.close();

        Player player = new Player.PlayerBuilder(firstName)
        .addMiddleName(middleName)
        .addLastName(lastName)
        .addAge(age)
        .addGender(gender)
        .addEmail_address(email)
        .addFavorite_colour(colour)
        .build();

        System.out.print("\nYour Player Character: ");
        System.out.print(player.toString());
        return player;
    }

    public String getMapType(){
        Scanner sc = new Scanner(System.in);
        String map;

        System.out.println("\nChoose difficulty level [Type 1 for EASY or 2 for HARD]");
        int level = sc.nextInt();

        if (level == 1) {
            map = "EASY MAP";
        } else if (level == 2){
            map = "HARD MAP";
        } else {
            map = "UNDEFINED MAP LEVEL";
        }

        System.out.println("Game Difficulty Level: " + map);

        return map;
    }

    public void play(invoker i, Player p, Map map){
        System.out.println("\nYou are in room " + p.getCurrentRoom());
        
        if(map.getRooms().get(p.getCurrentRoom()).getEnemy() != null) {
        	System.out.println("\nAlso in the room is a " + map.getRooms().get(p.getCurrentRoom()).getEnemy().getName());
        }
        if(map.getRooms().get(p.getCurrentRoom()).getItem() != null) {
        	System.out.println("\nYou also notice a " + map.getRooms().get(p.getCurrentRoom()).getItem().getName() + " on the floor");
        }
        
        Dispatcher dispatcher = Dispatcher.getInstance();
		ConcreteAttackInterceptor interceptor = new ConcreteAttackInterceptor();
		dispatcher.register(interceptor);

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Health: " + p.getHealth());
        System.out.println("Stamina: " + p.getStamina());
        System.out.println("Enter Command...");

        String command = sc.nextLine().toUpperCase();
        //System.out.println("Command:" + command);

        switch(command){
            case "HELP":
                printGuidelines();
                break;
            case "MOVE NORTH":
                moveCommand moveNCommand = new moveCommand(p, map, command);
                i.setCommand(moveNCommand);
                i.commandInvoked();
                p.setStamina(p.getStamina()-5);
                break;
            case "MOVE SOUTH":
                moveCommand moveSCommand = new moveCommand(p, map, command);
                i.setCommand(moveSCommand);
                i.commandInvoked();
                p.setStamina(p.getStamina()-5);
                break;
            case "MOVE WEST":
                moveCommand moveWCommand = new moveCommand(p, map, command);
                i.setCommand(moveWCommand);
                i.commandInvoked();
                p.setStamina(p.getStamina()-5);
                break;
            case "MOVE EAST":
                moveCommand moveECommand = new moveCommand(p, map, command);
                i.setCommand(moveECommand);
                i.commandInvoked();
                p.setStamina(p.getStamina()-5);
                break;
            case "PICKUP SWORD":
                pickUpCommand pickUpCommand = new pickUpCommand(p, map.getRooms().get(p.getCurrentRoom()).removeItem("Sword"));
                i.setCommand(pickUpCommand);
                i.commandInvoked();
                p.setStamina(p.getStamina()-2);
                break;
            case "PICKUP POTION":
                pickUpCommand pickUpCommand2 = new pickUpCommand(p, map.getRooms().get(p.getCurrentRoom()).removeItem("Potion"));
                i.setCommand(pickUpCommand2);
                i.commandInvoked();
                p.setStamina(p.getStamina()-2);
                break;
            case "ATTACK":
            	AttackContext context = new AttackContext(p, map.getRooms().get(p.getCurrentRoom()).getEnemy());
                p.setStamina(p.getStamina()-5);
                try {
                    dispatcher.dispatchClientRequestInterceptorAttackEnemy(context);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "USE":
                usePotionCommand useCommand = new usePotionCommand(p, p.checkInventory("Potion"));
                i.setCommand(useCommand);
                i.commandInvoked();
                break;
            case "INVENTORY":
                ArrayList<Items> Inventory = p.getInventory();
                System.out.println("\n---Player Inventory---");
                for(Items item: Inventory){
                    System.out.println("Item " + item + ": " + i.toString());
                }
                System.out.println("\n----------------------");
            break;
            case "MAP":
                showMapCommand mapCommand = new showMapCommand(map);
                i.setCommand(mapCommand);
                i.commandInvoked();
                break;
            default:
                //
        }
    }
}