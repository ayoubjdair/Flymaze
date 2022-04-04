package testing_package;
import items_package.ItemConstructor;
import items_package.ItemFactory;

import javax.swing.plaf.synth.SynthSpinnerUI;

import enemy_package.Enemies;
import enemy_package.Vampire;
import enemy_package.Zombie;
import items_package.Item;
import items_package.ItemBuilder;
import items_package.PotionBuilder;
import items_package.SwordBuilder;
import player_package.Player;


public class AutomatedTesting implements Testing{

    @Override
    public void testItemBuilder() {
        System.out.print("\n---------- Testing Item Builder Pattern ----------\n \n");

        ItemBuilder swordBuilder = new SwordBuilder();
        ItemConstructor builder = new ItemConstructor(swordBuilder);
		builder.constructItem();
		Item sword = builder.getItem();
		System.out.println(sword.toString());

        ItemBuilder potionBuilder = new PotionBuilder();
        ItemConstructor builder2 = new ItemConstructor(potionBuilder);
		builder2.constructItem();
		Item potion = builder2.getItem();
		System.out.println(potion.toString());

        System.out.print("---------- Testing Item Builder Complete ----------\n");
    }

    @Override
    public void testPlayerBuilder() {
        System.out.print("\n---------- Testing Player Builder Pattern ----------\n \n");

        Player p1 = new Player.PlayerBuilder("Ayoub")
        .addMiddleName("Gamma")
        .addLastName("Jdair")
        .addAge(21)
        .addEmail_address("ayoubjdair00@gmail.com")
        .addGender("Male")
        .addFavorite_colour("Garnet Red")
        .build();

        Player p2 = new Player.PlayerBuilder("Mia")
        .addGender("Female")
        .addLastName("Jdair")
        .addFavorite_colour("Mint Green")
        .build();

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        System.out.print("---------- Testing Player Builder Complete ----------\n");
    }

    @Override
    public void testComposite() {
        System.out.print("\n---------- Testing Composite Pattern ----------\n \n");

        System.out.println("Creating new Vampire Enemies...");
        Vampire vampire = new Vampire("Vampire 1", 1, 100, false);
        Vampire vampire2 = new Vampire("Vampire 2", 2, 100, false);
        System.out.println("Creating new Vampire Enemies List...");
        Enemies vampires = new Enemies();
        System.out.println("Adding new Vampires to List Enemies List...");
        vampires.addEnemy(vampire);
        vampires.addEnemy(vampire2);
        System.out.println(vampires.getHealth());
        System.out.println(vampires.getRoomNumber());
        System.out.println(vampires.toString());
        System.out.println("Setting all vampire health to 50...");
        vampires.setHealth(50);
        System.out.println(vampires.toString());

        System.out.println("Creating new Zombie Enemies...");
        Zombie zombie = new Zombie("Zombie 1", 1, 100, false);
        Zombie zombie2 = new Zombie("Zombie 2", 1, 100, false);
        System.out.println("Creating new Zombie Enemies List...");
        Enemies zombies = new Enemies();
        System.out.println("Adding new Vampires to List Enemies List...");
        zombies.addEnemy(zombie);
        zombies.addEnemy(zombie2);
        System.out.println(zombies.getHealth());
        System.out.println(zombies.getRoomNumber());
        System.out.println(zombies.toString());
        System.out.println("Setting all zombie health to 50...");
        zombies.setHealth(50);
        System.out.println(zombies.toString());

        System.out.print("---------- Testing Composite Complete ----------\n");
    }

    @Override
    public void testFlyweight() {
        System.out.print("\n---------- Testing Flyweight Pattern ----------\n \n");

        System.out.println("Creating 2 Test Sword Items...");
        for (int i = 0; i < 2; i++){
            Item item = ItemFactory.getItem("Sword");
            System.out.print(item.toString());
        }

        System.out.println("\n\nCreating 2 Test Potion Items...");
        for (int i = 0; i < 2; i++){
            Item item = ItemFactory.getItem("Potion");
            System.out.print(item.toString());
        }

        System.out.print("---------- Testing Flyweight Complete ----------\n");
    }
}
