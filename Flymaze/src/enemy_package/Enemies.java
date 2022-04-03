package enemy_package;

// Composite class
import java.util.ArrayList;
import java.util.List;
  
public class Enemies implements Enemy
{
    private List<Enemy> enemiesList = new ArrayList<Enemy>();

    // Getters
    @Override
    public int getRoomNumber() {
        for(Enemy en:enemiesList)
        {
            return en.getRoomNumber();
        }
        return 0;
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
    public Boolean getIsDead() {
        for(Enemy en:enemiesList)
        {
            return en.getIsDead();
        }
        return false;
    }
    
    @Override
	public String getName() {
		for(Enemy en:enemiesList) {
			return en.getName();
		}
		return "";
	}

    // Setters
    @Override
    public void setHealth(int health) 
    {
        for(Enemy en:enemiesList)
        {
            en.setHealth(health);
        }
    }

    @Override
    public void setRoomNumber(int room) {
        for(Enemy en:enemiesList)
        {
            en.setRoomNumber(room);
        }
    }

    @Override
    public void setIsDead(Boolean dead) {
        for(Enemy en:enemiesList)
        {
            en.setIsDead(dead);;
        }
    }
    
    @Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}


    public String toString(){
        String desc = "\n ";
        for(Enemy en:enemiesList)
        {
            desc += en.toString();
        }
        return desc;
    }

    public void addEnemy(Enemy en)
    {
        enemiesList.add(en);
    }
       
    public void removeEnemy(Enemy en)
    {
        enemiesList.remove(en);
    }

	

	
    
}