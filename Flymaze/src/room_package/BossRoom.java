package room_package;

import java.util.ArrayList;

import enemy_package.Enemy;
import items_package.Items;

public class BossRoom implements Room{
	
	int id;
	ArrayList<Items> itemsInRoom = new ArrayList<Items>();
	//String itemsInRoom[];
	ArrayList<Enemy> enemiesInRoom = new ArrayList<Enemy>();
	//Enemy enemiesInRoom[];
	int n, s, e, w;

	@Override
	public void removeItem(String itemName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEnemy(String enemyName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItem(Items item) {
		itemsInRoom.add(item);
	}

	@Override
	public void addEnemy(Enemy e) {
		enemiesInRoom.add(e);
	}

	@Override
	public void setExits(int north, int south, int east, int west) {
		this.n = north;
		this.s = south;
		this.e = east;
		this.w = west;
		
	}

	

}
