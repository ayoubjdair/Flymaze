package room_package;

import enemy_package.Enemy;

public class StandardRoom implements Room{
	
	int id;
	//int connectingRooms[];
	String itemsInRoom[];
	Enemy enemiesInRoom[];
	int n, s, e, w;
	
	public StandardRoom() {
		
	}
	
	public StandardRoom(int id, String[] items, Enemy[] enemies, int nExit, int sExit, int eExit, int wExit) {
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
		//This is to check that the value was found
		boolean notNull = false;
		int index = 0;
		
		for (int i=0;i<itemsInRoom.length;i++) {
		    if (itemsInRoom[i].equals(itemName)) {
		        index = i;
		        notNull = true;
		        break;
		    }
		}
		
		if(notNull == true) {
			
			String[] newArray = new String[itemsInRoom.length - 1];
			 
	        for (int i = 0, k = 0; i < itemsInRoom.length; i++) {
	        	if (i == index) {
	                continue;
	            }
	            newArray[k++] = itemsInRoom[i];
	        }
	        
	        itemsInRoom = newArray;
			
		}
	}
		
		
	
	@Override
	public void removeEnemy(String enemyName) {

		boolean notNull = false;
		int index = 0;
		
		for (int i=0;i<enemiesInRoom.length;i++) {
		    if (enemiesInRoom[i].equals(enemyName)) {
		        index = i;
		        notNull = true;
		        break;
		    }
		}
		
		if(notNull == true) {
			
			Enemy[] newArray = new Enemy[enemiesInRoom.length - 1];
			 
	        for (int i = 0, k = 0; i < enemiesInRoom.length; i++) {
	        	if (i == index) {
	                continue;
	            }
	            newArray[k++] = enemiesInRoom[i];
	        }
	        
	        enemiesInRoom = newArray;
			
		}
		
	}
	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addEnemy() {
		// TODO Auto-generated method stub
		
	}
	
}
