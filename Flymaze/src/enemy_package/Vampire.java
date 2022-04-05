package enemy_package;

// leaf node
public class Vampire implements Enemy {
    private int roomNumber;
    private int health;
    private boolean dead;
    private String name;

    public Vampire(int roomNumber){
        this.name = "Vampire";
        this.roomNumber = roomNumber;
        this.health = 100;
        this.dead = false;
    }

     // Getters
     public Boolean getIsDead() {
         return dead;
     }
 
     public String getName() {
         return name;
     }
 
     public int getRoomNumber() {
         return roomNumber;
     }
 
     public int getHealth(){
         return health;
     }
 
    // Setters
    public void setHealth(int health){
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomNumber(int room) {
        this.roomNumber = room;
    }

    public void setIsDead(boolean dead) {
        this.dead = dead;
    }

    public String toString(){
        return "Enemy Name: " + getName() + "\n"+
        "Health  " + getHealth() + "\n" +
        "In Room " + getRoomNumber() + "\n";
    }
}