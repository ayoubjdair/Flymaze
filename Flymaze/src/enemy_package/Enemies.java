package enemy_package;

// Composite class
import java.util.ArrayList;
import java.util.List;
  
public class Enemies implements Enemy
{
    private List<Enemy> enemiesList = new ArrayList<Enemy>();

    public void addToEnemyList(Enemy en)
    {
        enemiesList.add(en);
    }
       
    public void removeFromEnemyList(Enemy en)
    {
        enemiesList.remove(en);
    }

    public void showAllEnemies(){
        for(Enemy e: enemiesList){
            System.out.println(e.toString());
        }
    }

    @Override
    public void setIsDead(boolean dead){
        for(Enemy e: enemiesList){
            e.setIsDead(dead);
        }
    }

    @Override
	public String getName() {
		for(Enemy en:enemiesList) {
			return en.getName();
		}
		return "";
	}

    @Override
    public int getHealth() 
    {
        for(Enemy en:enemiesList)
        {
            return en.getHealth();
        }
        return 0;
    }

    @Override
    public void setHealth(int health) 
    {
        for(Enemy en:enemiesList)
        {
            en.setHealth(health);
        }
    }

    @Override
    public int getRoomNumber() {
        for(Enemy en:enemiesList)
        {
            return en.getRoomNumber();
        }
        return 0;
    }
}