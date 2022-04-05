package room_package;

import java.util.ArrayList;

import enemy_package.Enemy;
import items_package.Items;

public class StandardRoom implements Room{
	
	int id;
	ArrayList<Items> itemsInRoom = new ArrayList<Items>();
	ArrayList<Enemy> enemiesInRoom = new ArrayList<Enemy>();
	int n, s, e, w;
	
	public StandardRoom() {
		
	}
	
	public StandardRoom(int id, ArrayList<Items> items, ArrayList<Enemy> enemies, int nExit, int sExit, int eExit, int wExit) {
		this.id = id;
		this.itemsInRoom = items;
		this.enemiesInRoom = enemies;
		this.n = nExit;
		this.s = sExit;
		this.e = eExit;
		this.w = wExit;
	}
	
	//Revisit these to see if an arraylist would be better
	//Cant remember why I was fixated on an array over arraylist
	
	@Override
	public void removeItem(String itemName) {
		int itemIndex = 0;
		for (int i = 0; i < itemsInRoom.size(); i++) {
			if(itemsInRoom.get(i).getName() == itemName) {
				itemIndex = i;
				break;
			}
		}
		itemsInRoom.remove(itemIndex);
	}
		
		
	
	@Override
	public void removeEnemy(String enemyName) {
		int enemyIndex = 0;
		for (int i = 0; i < enemiesInRoom.size(); i++) {
			if(enemiesInRoom.get(i).getName() == enemyName) {
				enemyIndex = i;
				break;
			}
		}
		enemiesInRoom.remove(enemyIndex);
		
		
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

	@Override
	public int getNorth() {
		return this.n;
	}

	@Override
	public int getSouth() {
		return this.s;
	}

	@Override
	public int getEast() {
		return this.e;
	}

	@Override
	public int getWest() {
		return this.w;
	}

	@Override
	public void setID(int ID) {
		this.id = ID;
		
	}

	@Override
	public int getID() {
		return this.id;
	}
	
}
