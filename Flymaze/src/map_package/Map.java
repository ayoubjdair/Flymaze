package map_package;

import java.util.ArrayList;

import room_package.Room;

public interface Map {
	
	public void populateRooms();
	
	public void populateRoomExits();

	public String showMap();
	
	public void generateMapString();
	
	public ArrayList<Room> getRooms();
	
}
