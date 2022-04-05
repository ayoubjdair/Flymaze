package map_package;

import java.util.ArrayList;

import enemy_package.Vampire;
import enemy_package.Zombie;
import room_package.Room;
import room_package.RoomFactory;

public class EasyMap implements Map {
	
	ArrayList<Room> rooms = new ArrayList<Room>();
	RoomFactory roomFactory = new RoomFactory();
	//This decides if it will be map layout 1 or two
	int mapNum = (int) ((Math.random() * (3 - 1)) + 1);
	String mapString;
	
	public EasyMap() {
		if (mapNum == 1) {
			for (int i = 0; i < 9; i++) {
				rooms.add(roomFactory.getRoom("STANDARD ROOM"));
				rooms.get(i).setID(i);
			}
			rooms.add(roomFactory.getRoom("BOSS ROOM"));
			rooms.get(9).setID(9);
		} 
		else if(mapNum == 2) {
			for (int i = 0; i < 7; i++) {
				rooms.add(roomFactory.getRoom("STANDARD ROOM"));
				rooms.get(i).setID(i);
			}
			rooms.add(roomFactory.getRoom("BOSS ROOM"));
			rooms.get(7).setID(7);
		}
	}
	
	public String showMap() {
		//To be printed by the command design pattern
		return mapString;
	}

	public void generateMapString() {
		if(mapNum == 1) {
			mapString = "    [B]    \n[6] [7] [8]\n[5] [4] [3]\n[S] [1] [2]";
		}else if(mapNum == 2) {
			mapString = "        [3] [4]    \n[S] [1] [2]        \n        [5] [6] [B]";
		}
	}

	public void populateRooms() {
		if (mapNum == 1) {
			int zombieRoom = (int) ((Math.random() * (9 - 1)) + 1);
			int vampireRoom = (int) ((Math.random() * (9 - 1)) + 1);
			
			Zombie zombie = new Zombie(zombieRoom);
			Vampire vampire = new Vampire(vampireRoom);
			
			rooms.get(zombieRoom).addEnemy(zombie);
			rooms.get(vampireRoom).addEnemy(vampire);
		}
		else if (mapNum == 2) {
			int zombieRoom1 = (int) ((Math.random() * (9 - 1)) + 1);
			int zombieRoom2 = (int) ((Math.random() * (9 - 1)) + 1);
			int zombieRoom3 = (int) ((Math.random() * (9 - 1)) + 1);
			int vampireRoom1 = (int) ((Math.random() * (9 - 1)) + 1);
			int vampireRoom2 = (int) ((Math.random() * (9 - 1)) + 1);
			
			Zombie zombie1 = new Zombie(zombieRoom1);
			Zombie zombie2 = new Zombie(zombieRoom2);
			Zombie zombie3 = new Zombie(zombieRoom3);
			Vampire vampire1 = new Vampire(vampireRoom1);
			Vampire vampire2 = new Vampire(vampireRoom2);
			
			//Need enemy builder in here
			rooms.get(zombieRoom1).addEnemy(zombie1);
			rooms.get(zombieRoom2).addEnemy(zombie2);
			rooms.get(zombieRoom3).addEnemy(zombie3);
			rooms.get(vampireRoom1).addEnemy(vampire1);
			rooms.get(vampireRoom2).addEnemy(vampire2);
			
		}
	}

	public void populateRoomExits() {
		if (mapNum == 1) {
			//Standard rooms
			rooms.get(0).setExits(-1, -1, 1, -1);
			rooms.get(1).setExits(-1, -1, 2, 1);
			rooms.get(2).setExits(3, -1, -1, 1);
			rooms.get(3).setExits(-1, 2, -1, 4);
			rooms.get(4).setExits(-1, -1, 3, 5);
			rooms.get(5).setExits(6, -1, 4, -1);
			rooms.get(6).setExits(-1, 5, 7, -1);
			rooms.get(7).setExits(9, -1, 8, 6);
			rooms.get(8).setExits(-1, -1, -1, 7);
			
			//Boss room
			rooms.get(9).setExits(-1, 7, -1, -1);
		}
		else if (mapNum == 2) {
			//Standard rooms
			rooms.get(0).setExits(-1, -1, 1, -1);
			rooms.get(1).setExits(-1, -1, 2, 0);
			rooms.get(2).setExits(3, 5, -1, 1);
			rooms.get(3).setExits(-1, 2, 4, -1);
			rooms.get(4).setExits(-1, -1, -1, 3);
			rooms.get(5).setExits(2, -1, 6, -1);
			rooms.get(6).setExits(-1, -1, 7, 5);
			
			//Boss room
			rooms.get(9).setExits(-1, -1, -1, 6);
		}
	}

	@Override
	public ArrayList<Room> getRooms() {
		return this.rooms;
	}
}