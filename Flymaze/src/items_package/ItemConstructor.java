package items_package;

public class ItemConstructor{
 
    private ItemBuilder itemBuilder;
 
    public ItemConstructor(ItemBuilder itemBuilder)
    {
        this.itemBuilder = itemBuilder;
    }
 
    public Item getItem()
    {
        return this.itemBuilder.getItem();
    }
 
    public void constructItem()
    {
        this.itemBuilder.buildDescription();
        this.itemBuilder.buildIsDefence();
        this.itemBuilder.buildIsEnchanted();
        this.itemBuilder.buildIsLocked();
        this.itemBuilder.buildLevel();
        this.itemBuilder.buildName();
        this.itemBuilder.buildPower();
        this.itemBuilder.buildisAttack();
    }
}