package enemy_package;

// import enemies.enemy;
// leaf node
public class Zombie implements Enemy {
    private int roomNumber;
    private int health;
    private boolean dead;
    private String name;
    
    public Zombie(String name, int roomNumber, int health, boolean dead){
        this.name = name;
        this.roomNumber = roomNumber;
        this.health = health;
        this.dead = dead;
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