package player_package;

import java.util.ArrayList;

import items_package.Item;

// Demonstrates the builder design pattern
public class Player {

    public String firstName;
    public String middleName;
    public String lastName;
    public String gender;
    public String email_address;
    public String favorite_colour;

    public int age;
    public int level;
    public int health;
    public int stamina;
    public int attackStrength;

    public ArrayList<Item> inventory;

    private Player(PlayerBuilder playerBuilder) {
        this.firstName = playerBuilder.firstName;
        this.middleName = playerBuilder.middleName;
        this.lastName = playerBuilder.lastName;
        this.gender = playerBuilder.gender;
        this.email_address = playerBuilder.email_address;
        this.favorite_colour = playerBuilder.favorite_colour;
        this.age = playerBuilder.age;
        this.level = playerBuilder.level;
        this.health = playerBuilder.health;
        this.stamina = playerBuilder.stamina;
        this.attackStrength = playerBuilder.attackStrength;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGender() {
        return gender;
    }

    public String getFavoriteColour() {
        return favorite_colour;
    }

    public int getAge() {
        return age;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getStaminal() {
        return stamina;
    }

    public int getAttackStat() {
        return attackStrength;
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    // Setters
    public void setHealth(int health){
        this.health = health;
    }

    public void setStamina(int stamina){
        this.stamina = stamina;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public String toString() {
        return "\nPlayer Name: " + firstName + " " + middleName + " " + lastName + " \n" +
                "Player Level: " + level + "\n" +
                "Player Health: " + health + "\n" +
                "Player Stamina: " + stamina + "\n" +
                "Player Inventory: " + getInventory() + "\n" +
                "Gender: " + gender + "\n" +
                "Age: " + age + "\n" +
                "Favorite Colour: " + favorite_colour + "\n" + 
                "Email: " + email_address + "\n";
    }

    public static class PlayerBuilder {

        private String firstName;
        private String middleName;
        private String lastName;
        private String gender;
        private String email_address;
        private String favorite_colour;
       
        public int age;
        public int level = 1;
        public int health = 100;
        public int stamina = 100;
        public int attackStrength = 10;

        public PlayerBuilder(String firstName) {
			this.firstName = firstName;
		}

        public PlayerBuilder addMiddleName(String middleName) {
            if(!middleName.isEmpty()){
                this.middleName = middleName;
            }
            return this;
		}

        public PlayerBuilder addLastName(String lastName) {
			if(!lastName.isEmpty()){
                this.lastName = lastName;
            }
            return this;
		}

        public PlayerBuilder addGender(String gender) {
            if(!gender.isEmpty()){
                this.gender = gender;
            }
            return this;
		}

        public PlayerBuilder addEmail_address(String email_address) {
			if(!email_address.isEmpty()){
                this.email_address = email_address;
            }
            return this;
		}

        public PlayerBuilder addFavorite_colour(String favorite_colour) {
			if(!favorite_colour.isEmpty()){
                this.favorite_colour = favorite_colour;
            }
            return this;
		}


        public PlayerBuilder addAge(int age) {
			if(age != 0){
                this.age = age;
            }
            return this;
        }

        public Player build(){
            Player player = new Player(this);
            return player;
        }
    }
}