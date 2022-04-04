package map_package;

import java.util.ArrayList;

import room_package.Room;
import room_package.RoomFactory;

public class HardMap implements Map{

	ArrayList<Room> rooms = new ArrayList<Room>();
	RoomFactory roomFactory = new RoomFactory();
	
	//This decides if it will be map layout 1 or two
	int mapNum = (int) ((Math.random() * (2 - 1)) + 1);
	String map;
	
	public HardMap() {
		if (mapNum == 1) {
			for (int i = 0; i < 13; i++) {
				rooms.add(roomFactory.getRoom("STANDARD ROOM"));
			}
			rooms.add(roomFactory.getRoom("BOSS ROOM"));
		} 
		else if(mapNum == 2) {
			for (int i = 0; i < 15; i++) {
				rooms.add(roomFactory.getRoom("STANDARD ROOM"));
			}
			rooms.add(roomFactory.getRoom("BOSS ROOM"));
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
			
			//Need enemy builder in here
			rooms.get(zombieRoom1).addEnemy(null);
			rooms.get(zombieRoom2).addEnemy(null);
			rooms.get(zombieRoom3).addEnemy(null);
			rooms.get(zombieRoom4).addEnemy(null);
			rooms.get(vampireRoom1).addEnemy(null);
			rooms.get(vampireRoom2).addEnemy(null);
		}
		
		else if (mapNum == 2) {
			int zombieRoom1 = (int) ((Math.random() * (14 - 12)) + 1);
			int zombieRoom2 = (int) ((Math.random() * (12 - 10)) + 1);
			int zombieRoom3 = (int) ((Math.random() * (10 - 8)) + 1);
			int zombieRoom4 = (int) ((Math.random() * (8 - 6)) + 1);
			
			int vampireRoom1 = (int) ((Math.random() * (12 - 8)) + 1);
			int vampireRoom2 = (int) ((Math.random() * (8- 4)) + 1);
			int vampireRoom3 = (int) ((Math.random() * (4 - 1)) + 1);
			
			//Need enemy builder in here
			rooms.get(zombieRoom1).addEnemy(null);
			rooms.get(zombieRoom2).addEnemy(null);
			rooms.get(zombieRoom3).addEnemy(null);
			rooms.get(zombieRoom4).addEnemy(null);
			rooms.get(vampireRoom1).addEnemy(null);
			rooms.get(vampireRoom2).addEnemy(null);
			rooms.get(vampireRoom3).addEnemy(null);
			
		}
	}

	public void populateRoomExits() {
		if (mapNum == 1) {
			//Standard rooms
			rooms.get(0).setExits(0, 0, 1, 0);
			rooms.get(1).setExits(1, 0, 0, 1);
			rooms.get(2).setExits(0, 1, 1, 1);
			rooms.get(3).setExits(1, 0, 1, 0);
			rooms.get(4).setExits(0, 1, 0, 0);
			rooms.get(5).setExits(1, 0, 0, 1);
			rooms.get(6).setExits(1, 1, 1, 0);
			rooms.get(7).setExits(0, 1, 0, 1);
			rooms.get(8).setExits(1, 1, 0, 0);
			rooms.get(9).setExits(1, 0, 0, 1);
			rooms.get(10).setExits(0, 0, 1, 0);
			rooms.get(11).setExits(0, 1, 0, 1);
			rooms.get(12).setExits(0, 0, 1, 1);
			
			//Boss room
			rooms.get(13).setExits(0, 0, 1, 0);
		}
		
		else if (mapNum == 2) {
			//Standard rooms
			rooms.get(0).setExits(1, 0, 0, 0);
			rooms.get(1).setExits(1, 1, 0,0);
			rooms.get(2).setExits(1, 1, 0, 0);
			rooms.get(3).setExits(0, 1, 1, 0);
			rooms.get(4).setExits(0, 0, 1, 1);
			rooms.get(5).setExits(0, 0, 1, 1);
			rooms.get(6).setExits(0, 1, 0, 1);
			rooms.get(7).setExits(1, 0, 0, 1);
			rooms.get(8).setExits(0, 0, 1, 1);
			rooms.get(9).setExits(0, 1, 1, 0);
			rooms.get(10).setExits(1, 0, 1, 0);
			rooms.get(11).setExits(0, 0, 1, 1);
			rooms.get(12).setExits(0, 1, 0, 1);
			rooms.get(13).setExits(1, 0, 0, 1);
			rooms.get(14).setExits(0, 0, 1, 1);
			
			//Boss room
			rooms.get(15).setExits(0, 0, 1, 0);
			
		}
	}

	public String showMap() {
		return map;
	}

	public void generateMapString() {
		if(mapNum == 1) {
			map = "[B] [12] [11]    \n[4]     [6] [7]\n[3] [2] [5] [8]\n[S] [1] [10] [9]";
		}else if(mapNum == 2) {
			map = "[3] [4]  [5]  [6]\n[2] [9]  [8]  [7]\n[1] [10] [11] [12]\n[S] [B]  [14] [13]";
		}
	}

}
