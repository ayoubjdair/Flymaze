package room_package;

import enemy_package.Enemy;
import items_package.Items;

public interface Room {
	
	public Items removeItem(String itemName);
	
	public void removeEnemy(String enemyName);
	
	public void addItem(Items item);
	
	public void addEnemy(Enemy e);
	
	public void setExits(int north, int south, int east, int west);
	
	public void setID(int ID);

	public int getNorth();
	
	public int getSouth();
	
	public int getEast();
	
	public int getWest();
	
	public int getID();
	
	public Enemy getEnemy();
	
	public Items getItem();
	
	
}
