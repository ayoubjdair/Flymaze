package items_package;
// Demonstrates the builder design pattern
public class Item implements Items{
    
    public String description;
    public String name;
    public int power;
    public int level;
    public boolean isDefence;
    public boolean isAttack;
    public boolean isEnchanted;
    public boolean isLocked;


    @Override
    public void setName(String name) {
        this.name = name;        
    }

    @Override
    public void setDescription(String description) {
        this.description = description;        
    }

    @Override
    public void setPower(int power) {
        this.power = power;        
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void setisAttack(boolean isAttack) {
        this.isAttack = isAttack;        
    }

    @Override
    public void setIsDefence(boolean isDefence) {
        this.isDefence = isDefence;        
    }

    @Override
    public void setIsEnchanted(boolean isEnchanted) {
        this.isEnchanted = isEnchanted;        
    }

    @Override
    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPower() {
        return power;
    }

    public int getLevel() {
        return level;
    }

    public boolean getisAttack(){
        return isAttack;
    }

    public boolean getIsDefence(){
        return isDefence;
    }

    public boolean getIsEnchanted(){
        return isEnchanted;
    }

    public boolean getIsLocked(){
        return isLocked;
    }

    @Override
    public String toString() {
        return "Built Item: " + "\n" +
                "-> Name = '" +name + "'\n" +
                "-> Description = '" +description + "'\n" +
                "-> Power Level = " +power + "\n" +
                "-> Item Level = " +level +
                "-> For Attacking? ='" +isAttack + "'\n" +
                "-> For Defence?= '" +isDefence + "'\n" +
                "-> Enchanted?= '" +isEnchanted + "'\n" +
                "-> Locked?= '" +isLocked + "'\n";
    }
}