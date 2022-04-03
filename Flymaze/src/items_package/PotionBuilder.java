package items_package;

public class PotionBuilder implements ItemBuilder {

    Item item = new Item();

    public PotionBuilder(){
        this.item = new Item();
    }

    @Override
    public void buildName() {
        item.setName("Health Potion");
    }

    @Override
    public void buildDescription() {
        item.setDescription("Drink to increase health");
    }

    @Override
    public void buildPower() {
        item.setPower(1);
    }

    @Override
    public void buildLevel() {
       item.setLevel(1);
    }

    @Override
    public void buildisAttack() {
        item.setisAttack(false);
    }

    @Override
    public void buildIsDefence() {
       item.setIsDefence(true); 
    }

    @Override
    public void buildIsEnchanted() {
       item.setIsEnchanted(false);
    }

    @Override
    public void buildIsLocked() {
        item.setIsLocked(false);
    }

    public String getName() {
        return item.name;
    }

    public String getDescription() {
        return item.description;
    }

    public int getPower() {
        return item.power;
    }

    public int getLevel() {
        return item.level;
    }

    public boolean getisAttack(){
        return item.isAttack;
    }

    public boolean getIsDefence(){
        return item.isDefence;
    }

    public boolean getIsEnchanted(){
        return item.isEnchanted;
    }

    public boolean getIsLocked(){
        return item.isLocked;
    }

    @Override
    public String toString() {
        return "Built Item: " + "\n" +
                "-> Name = '" +item.name + "'\n" +
                "-> Description = '" +item.description + "'\n" +
                "-> Power Level = " +item.power + "\n" +
                "-> Item Level = " +item.level +
                "-> For Attacking? ='" +item.isAttack + "'\n" +
                "-> For Defence?= '" +item.isDefence + "'\n" +
                "-> Enchanted?= '" +item.isEnchanted + "'\n" +
                "-> Locked?= '" +item.isLocked + "'\n";
    }

    @Override
    public Item getItem() {
        return this.item;
    }
}
