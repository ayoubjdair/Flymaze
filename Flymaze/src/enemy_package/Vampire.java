package enemy_package;

// leaf node
public class Vampire implements Enemy {
    private int roomNumber;
    private int health;
    private boolean dead;
    private String name;

    public Vampire(String name, int roomNumber, int health, boolean dead){
        this.roomNumber = roomNumber;
        this.health = health;
        this.dead = dead;
        this.name = name;
    }

     // Getters
     @Override
     public Boolean getIsDead() {
         return dead;
     }
 
     public String getName() {
         return name;
     }
 
     @Override
     public int getRoomNumber() {
         return roomNumber;
     }
 
     @Override
     public int getHealth(){
         return health;
     }
 
  
    // Setters
    @Override
    public void setHealth(int health){
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
        
    }

    @Override
    public void setRoomNumber(int room) {
        this.roomNumber = room;
    }

    @Override
    public void setIsDead(Boolean dead) {
        this.dead = dead;
    }

    @Override
    public String toString(){
        return "Enemy Name: " + getName() + "\n"+
        "Health  " + getHealth() + "\n" +
        "In Room " + getRoomNumber() + "\n";
    }
}