package map_package;

import java.util.ArrayList;

import enemy_package.Vampire;
import enemy_package.Zombie;
import room_package.Room;
import room_package.RoomFactory;

public class HardMap implements Map{

	ArrayList<Room> rooms = new ArrayList<Room>();
	RoomFactory roomFactory = new RoomFactory();
	
	//This decides if it will be map layout 1 or two
	int mapNum = (int) ((Math.random() * (3 - 1)) + 1);
	String mapString;
	
	public HardMap() {
		if (mapNum == 1) {
			for (int i = 0; i < 13; i++) {
				rooms.add(roomFactory.getRoom("STANDARD ROOM"));
				rooms.get(i).setID(i);
			}
			rooms.add(roomFactory.getRoom("BOSS ROOM"));
			rooms.get(13).setID(13);
		} 
		else if(mapNum == 2) {
			for (int i = 0; i < 15; i++) {
				rooms.add(roomFactory.getRoom("STANDARD ROOM"));
				rooms.get(i).setID(i);
			}
			rooms.add(roomFactory.getRoom("BOSS ROOM"));
			rooms.get(15).setID(15);
		}
	}
	
	public void populateRooms() {
		if (mapNum == 1) {
			int zombieRoom1 = (int) ((Math.random() * (12 - 10)) + 1);
			int zombieRoom2 = (int) ((Math.random() * (10 - 8)) + 1);
			int zombieRoom3 = (int) ((Math.random() * (8 - 6)) + 1);
			int zombieRoom4 = (int) ((Math.random() * (6 - 1)) + 1);
			
			int vampireRoom1 = (int) ((Math.random() * (12 - 1)) + 1);
			int vampireRoom2 = (int) ((Math.random() * (12 - 1)) + 1);
			
			Zombie zombie1 = new Zombie(zombieRoom1);
			Zombie zombie2 = new Zombie(zombieRoom2);
			Zombie zombie3 = new Zombie(zombieRoom3);
			Zombie zombie4 = new Zombie(zombieRoom4);
			Vampire vampire1 = new Vampire(vampireRoom1);
			Vampire vampire2 = new Vampire(vampireRoom2);
			
			rooms.get(zombieRoom1).addEnemy(zombie1);
			rooms.get(zombieRoom2).addEnemy(zombie2);
			rooms.get(zombieRoom3).addEnemy(zombie3);
			rooms.get(zombieRoom4).addEnemy(zombie4);
			rooms.get(vampireRoom1).addEnemy(vampire1);
			rooms.get(vampireRoom2).addEnemy(vampire2);
		}
		
		else if (mapNum == 2) {
			int zombieRoom1 = (int) ((Math.random() * (14 - 12)) + 1);
			int zombieRoom2 = (int) ((Math.random() * (12 - 10)) + 1);
			int zombieRoom3 = (int) ((Math.random() * (10 - 8)) + 1);
			int zombieRoom4 = (int) ((Math.random() * (8 - 6)) + 1);
			
			int vampireRoom1 = (int) ((Math.random() * (12 - 8)) + 1);
			int vampireRoom2 = (int) ((Math.random() * (8- 4)) + 1);
			int vampireRoom3 = (int) ((Math.random() * (4 - 1)) + 1);
			
			Zombie zombie1 = new Zombie(zombieRoom1);
			Zombie zombie2 = new Zombie(zombieRoom2);
			Zombie zombie3 = new Zombie(zombieRoom3);
			Zombie zombie4 = new Zombie(zombieRoom4);
			Vampire vampire1 = new Vampire(vampireRoom1);
			Vampire vampire2 = new Vampire(vampireRoom2);
			Vampire vampire3 = new Vampire(vampireRoom2);
			
			//Need enemy builder in here
			rooms.get(zombieRoom1).addEnemy(zombie1);
			rooms.get(zombieRoom2).addEnemy(zombie2);
			rooms.get(zombieRoom3).addEnemy(zombie3);
			rooms.get(zombieRoom4).addEnemy(zombie4);
			rooms.get(vampireRoom1).addEnemy(vampire1);
			rooms.get(vampireRoom2).addEnemy(vampire2);
			rooms.get(vampireRoom3).addEnemy(vampire3);
		}
	}

	public void populateRoomExits() {
		if (mapNum == 1) {
			//Standard rooms
			rooms.get(0).setExits(-1, -1, 1, -1);
			rooms.get(1).setExits(2, -1, -1, 0);
			rooms.get(2).setExits(-1, 1, 5, 3);
			rooms.get(3).setExits(4, -1, 2, -1);
			rooms.get(4).setExits(-1, 3, -1, -1);
			rooms.get(5).setExits(6, -1, -1, 2);
			rooms.get(6).setExits(11, 5, 7, -1);
			rooms.get(7).setExits(-1, 8, -1, 6);
			rooms.get(8).setExits(7, 9, -1, -1);
			rooms.get(9).setExits(8, -1, -1, 10);
			rooms.get(10).setExits(-1, -1, 9, -1);
			rooms.get(11).setExits(-1, 6, -1, 12);
			rooms.get(12).setExits(-1, -1, 11, 13);
			
			//Boss room
			rooms.get(13).setExits(-1, -1, 12, -1);
		}
		
		else if (mapNum == 2) {
			//Standard rooms
			rooms.get(0).setExits(1, -1, -1, -1);
			rooms.get(1).setExits(2, 0, -1, -1);
			rooms.get(2).setExits(3, 1, -1, -1);
			rooms.get(3).setExits(-1, 2, 4, -1);
			rooms.get(4).setExits(-1, -1, 5, 3);
			rooms.get(5).setExits(-1, -1, 6, 4);
			rooms.get(6).setExits(-1, 7, -1, 5);
			rooms.get(7).setExits(6, -1, -1, 8);
			rooms.get(8).setExits(-1, -1, 7, 9);
			rooms.get(9).setExits(-1, 10, 8, -1);
			rooms.get(10).setExits(9, -1, 11, -1);
			rooms.get(11).setExits(-1, -1, 12, 10);
			rooms.get(12).setExits(-1, 13, -1, 11);
			rooms.get(13).setExits(12, -1, -1, 14);
			rooms.get(14).setExits(-1, -1, 13, 15);
			
			//Boss room
			rooms.get(15).setExits(-1, -1, 14, -1);
			
		}
	}

	public String showMap() {
		return mapString;
	}

	public void generateMapString() {
		if(mapNum == 1) {
			mapString = "[B] [12] [11]    \n[4]     [6] [7]\n[3] [2] [5] [8]\n[S] [1] [10] [9]";
		}else if(mapNum == 2) {
			mapString = "[3] [4]  [5]  [6]\n[2] [9]  [8]  [7]\n[1] [10] [11] [12]\n[S] [B]  [14] [13]";
		}
	}

	@Override
	public ArrayList<Room> getRooms() {
		return this.rooms;
	}
}
