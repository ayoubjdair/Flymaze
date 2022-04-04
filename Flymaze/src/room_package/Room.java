package room_package;

import enemy_package.Enemy;
import items_package.Items;

public interface Room {
	
	public void removeItem(String itemName);
	
	public void removeEnemy(String enemyName);
	
	public void addItem(Items item);
	
	public void addEnemy(Enemy e);
	
	public void setExits(int north, int south, int east, int west);

	
	
	
}
