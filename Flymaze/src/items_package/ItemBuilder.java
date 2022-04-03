package items_package;
public interface ItemBuilder {
    
    // Setters
    public void buildName();
    public void buildDescription();
    public void buildPower();
    public void buildLevel();
    public void buildisAttack();
    public void buildIsDefence();
    public void buildIsEnchanted();
    public void buildIsLocked();

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

    public Item getItem();
}