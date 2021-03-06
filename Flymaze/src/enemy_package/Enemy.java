package enemy_package;
// Demonstrates composite design pattern
// Operations that can be performed on one enemy can be performed on a group of them
// package enemies;
//BOSS Enemy - has other low level enemies below it
// Interface Componenet
public interface Enemy {
    // Getters
    public int getHealth();
    public int getRoomNumber();
    public String getName();

    // Setters
    public void setHealth(int health);
    public void setIsDead(boolean dead);

    public String toString();
}
