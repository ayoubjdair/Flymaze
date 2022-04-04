package map_package;

import room_package.Room;

public class EasyMap implements Map {
	
	String map;
	int[] roomIDs;
	String[] exitDirections;
	Room[] rooms;
	
	public EasyMap() {
		
	}
	
	public String showMap() {
		//To be printed by the command design pattern
		return map;
	}


	public void generateMap() {
		map = "[1] [2] [3]\n[4] [5] [6]\n[7] [8] [9]";
	}


	public void populateRoomIDs() {
		for(int i = 0; i < 9; i++) {
			roomIDs[i] = i;
		}
	}


	public void populateRoomExits() {
		//Need to come back to this there should be an easy pattern to follow for a 3x3 in terms of UDLR
	}


}

