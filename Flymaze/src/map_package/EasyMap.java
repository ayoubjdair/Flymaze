package map_package;

import java.util.ArrayList;

import room_package.Room;
import room_package.RoomFactory;

public class EasyMap implements Map {
	
	String map;
	String[] exitDirections;
	ArrayList<Room> rooms = new ArrayList<Room>();
	RoomFactory roomFactory = new RoomFactory();
	//Room[] rooms;
	//This decides if it will be map layout 1 or two
	int mapNum = (int) ((Math.random() * (2 - 1)) + 1);
	
	public EasyMap() {
		
		if (mapNum == 1) {
			for (int i = 0; i < 9; i++) {
				rooms.add(roomFactory.getRoom("STANDARD ROOM"));
			}
			rooms.add(roomFactory.getRoom("BOSS ROOM"));
		} 
		
		else if(mapNum == 2) {
			for (int i = 0; i < 7; i++) {
				rooms.add(roomFactory.getRoom("STANDARD ROOM"));
			}
			rooms.add(roomFactory.getRoom("BOSS ROOM"));
		}
		
		
	}
	
	public String showMap() {
		//To be printed by the command design pattern
		return map;
	}


	public void generateMap() {
		map = "[1] [2] [3]\n[4] [5] [6]\n[7] [8] [9]";
	}


	public void populateRooms() {
		if (mapNum == 1) {
			int zombieRoom = (int) ((Math.random() * (9 - 1)) + 1);
			int vampireRoom = (int) ((Math.random() * (9 - 1)) + 1);
			
			//Need enemy builder in here
			rooms.get(zombieRoom).addEnemy(null);
		}
		
		else if (mapNum == 2) {
			
			
		}
		
		
	}


	public void populateRoomExits() {
		if (mapNum == 1) {
			//Standard rooms
			rooms.get(0).setExits(0, 0, 1, 0);
			rooms.get(1).setExits(0, 0, 1, 1);
			rooms.get(2).setExits(1, 0, 0, 1);
			rooms.get(3).setExits(0, 1, 0, 1);
			rooms.get(4).setExits(0, 0, 1, 1);
			rooms.get(5).setExits(1, 0, 1, 0);
			rooms.get(6).setExits(0, 1, 1, 0);
			rooms.get(7).setExits(1, 0, 1, 1);
			rooms.get(8).setExits(0, 0, 0, 1);
			
			//Boss room
			rooms.get(9).setExits(0, 1, 0, 0);
		}
		
		else if (mapNum == 2) {
			//Standard rooms
			rooms.get(0).setExits(0, 0, 1, 0);
			rooms.get(1).setExits(0, 0, 1, 1);
			rooms.get(2).setExits(1, 1, 0, 1);
			rooms.get(3).setExits(0, 1, 1, 0);
			rooms.get(4).setExits(0, 0, 0, 1);
			rooms.get(5).setExits(1, 0, 1, 0);
			rooms.get(6).setExits(0, 0, 1, 1);
			
			//Boss room
			rooms.get(9).setExits(0, 0, 0, 1);
			
		}
	}



}

