package game_package;

import java.util.Scanner;
import player_package.Player;

public class InitGame {

    public void printWelcomeMessage(){
        System.out.println("\n       Welcome to FlyMaze! ░░░░░░");

        System.out.println("             ▬▬▬.◙.▬▬▬           ");
        System.out.println("              ═▂▄▄▓▄▄▂           ");
        System.out.println("             ◢◤ █▀▀████▄▄▄▄◢◤    ");
        System.out.println("             █▄▂█ █▄███▀▀▀▀▀▀▀╬  ");
        System.out.println("             ◥█████◤             ");
        System.out.println("             ══╩══╩═             ");
        System.out.println("             ╬═╬                 ");
        System.out.println("             ╬═╬                 ");
        System.out.println("             ╬═╬                 ");
        System.out.println("             ╬═╬                 ");
        System.out.println("             ╬═╬                 ");
        System.out.println("             ╬═╬ ☻/              ");
        System.out.println("             ╬═╬/▌               ");
        System.out.println("             ╬═╬/                ");

        System.out.println("\nYou just got dropped into the maze...");
    }

    public void printGuidelines(){
        System.out.println("\nPLACEHOLDER Player Instructions");
    }

    public void printMap(String map){
        System.out.println("\nPLACEHOLDER Map image of type: " + map);
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
        sc.close();

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
}