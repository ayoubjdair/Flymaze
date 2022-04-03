package items_package;
// Demonstrates the builder design pattern
public interface Items {

    // Setters
    public void setName(String name);
    public void setDescription(String description);
    public void setPower(int power);
    public void setLevel(int level);
    public void setisAttack(boolean isAttack);
    public void setIsDefence(boolean isDefence);
    public void setIsEnchanted(boolean isEnchanted);
    public void setIsLocked(boolean isLocked);

    // Getters
    public String getName();
    public String getDescription();
    public int getPower();
    public int getLevel();
    public boolean getisAttack();
    public boolean getIsDefence();
    public boolean getIsEnchanted();
    public boolean getIsLocked();

    @Override
    public String toString();
}
