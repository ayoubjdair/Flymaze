package enemy_package;

// import enemies.enemy;
// leaf node
public class Boss implements Enemy {
    private int roomNumber;
    private int health = 200;
    private boolean dead = false;
    private String name;
    
    public Boss(String name, int roomNumber){
        this.name = name;
        this.roomNumber = roomNumber;
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