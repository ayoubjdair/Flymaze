package enemy_package;

// import enemies.enemy;
// leaf node
public class Boss implements Enemy {
    private int roomNumber;
    private int health;
    private boolean dead;
    private String name;
    
    public Boss(int roomNumber){
        this.name = "BOSS";
        this.roomNumber = roomNumber;
        this.health = 200;
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


    @Override
    public String toString(){
        return "Enemy Name: " + getName() + "\n"+
        "Health  " + getHealth() + "\n" +
        "In Room " + getRoomNumber() + "\n";
    }
}