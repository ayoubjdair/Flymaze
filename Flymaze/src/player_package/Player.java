package player_package;
// Demonstrates the builder design pattern
public class Player {

    public String firstName;
    public String middleName;
    public String lastName;
    public String gender;
    public String email_address;
    public String favorite_colour;
    public int level;
    public int age;

    private Player(PlayerBuilder playerBuilder) {
        this.firstName = playerBuilder.firstName;
        this.middleName = playerBuilder.middleName;
        this.lastName = playerBuilder.lastName;
        this.level = playerBuilder.level;
        this.gender = playerBuilder.gender;
        this.email_address = playerBuilder.email_address;
        this.favorite_colour = playerBuilder.favorite_colour;
        this.favorite_colour = playerBuilder.favorite_colour;
    }

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

    public String toString() {
        return "\nPlayer Name: " + firstName + " " + middleName + " " + lastName + " \n" +
                "Player Level: " + level + "\n" +
                "Gender: " + gender + "\n" +
                "Age: " + age + "\n" +
                "Favorite Colour " + favorite_colour + "\n" + 
                "Email: " + email_address + "\n";
    }

    public static class PlayerBuilder {

        private String firstName;
        private String middleName;
        private String lastName;
        private String gender;
        private String email_address;
        private String favorite_colour;
        private int level;
        private int age;

        public PlayerBuilder(String firstName) {
			this.firstName = firstName;
		}

        public PlayerBuilder middleName(String middleName) {
			this.middleName = middleName;
            return this;
		}

        public PlayerBuilder lastName(String lastName) {
			this.lastName = lastName;
            return this;
		}

        public PlayerBuilder gender(String gender) {
			this.gender = gender;
            return this;
		}

        public PlayerBuilder email_address(String email_address) {
			this.email_address = email_address;
            return this;
		}

        public PlayerBuilder favorite_colour(String favorite_colour) {
			this.favorite_colour = favorite_colour;
            return this;
		}

        public PlayerBuilder level(int level) {
			this.level = level;
            return this;
		}

        public PlayerBuilder age(int age) {
			this.age = age;
            return this;
		}

        public Player build(){
            Player player = new Player(this);
            return player;
        }
    }
}