package game_package;

import java.util.Scanner;

import command_package.invoker;
import command_package.moveCommand;
import command_package.pickUpCommand;
import command_package.showMapCommand;
import command_package.usePotionCommand;
import map_package.Map;
import player_package.Player;

public class InitGame {

    public void printWelcomeMessage(){
        System.out.println("\n       Welcome to FlyMaze!");

        System.out.println("\nYou just got dropped into the maze...");
    }

    public void printGuidelines(){
        System.out.println("\n Game Instructions");
        System.out.println("\n Type one of the following");
        System.out.println("GO [NORTH, SOUTH, EAST, WEST] -> To change rooms");
        System.out.println("MAP -> Display map");
        System.out.println("PICKUP -> To pickup found item");
        System.out.println("USE -> To use health potion");
        System.out.println("ATTACK -> To attack enemy");
        System.out.println("HELP -> View these instructions again");
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

        System.out.println("Enter your age (Press enter to skip):");
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
        System.out.println("You are in room " + p.getCurrentRoom());

        String command = "MAP";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Command...");

        command = sc.nextLine().toUpperCase();
//        System.out.println("Command:" + command);

        switch(command){
            case "HELP":
                printGuidelines();
                break;
            case "MOVE NORTH":
                moveCommand moveNCommand = new moveCommand(p, map, "MOVE NORTH");
                i.setCommand(moveNCommand);
                i.commandInvoked();
                break;
            case "MOVE SOUTH":
                moveCommand moveSCommand = new moveCommand(p, map, "MOVE SOUTH");
                i.setCommand(moveSCommand);
                i.commandInvoked();
                break;
            case "MOVE WEST":
                moveCommand moveWCommand = new moveCommand(p, map, "MOVE WEST");
                i.setCommand(moveWCommand);
                i.commandInvoked();
                break;
            case "MOVE EAST":
                moveCommand moveECommand = new moveCommand(p, map, "MOVE EAST");
                i.setCommand(moveECommand);
                i.commandInvoked();
                System.out.println("Code reached");
                break;
            case "PICKUP SWORD":
                pickUpCommand pickUpCommand = new pickUpCommand(p, map.getRooms().get(p.getCurrentRoom()).removeItem("Sword"));
                i.setCommand(pickUpCommand);
                i.commandInvoked();
                break;
            case "PICKUP POTION":
                pickUpCommand pickUpCommand2 = new pickUpCommand(p, map.getRooms().get(p.getCurrentRoom()).removeItem("Potion"));
                i.setCommand(pickUpCommand2);
                i.commandInvoked();
                break;
            case "ATTACK":
                //
                break;
            case "USE":
                usePotionCommand useCommand = new usePotionCommand(p, p.checkInventory("Potion"));
                i.setCommand(useCommand);
                i.commandInvoked();
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