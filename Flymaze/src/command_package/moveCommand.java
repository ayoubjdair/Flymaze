package command_package;

import map_package.Map;
import player_package.Player;

public class moveCommand implements commandInterface{
	Player player;
	Map map;
	String direction;

	public moveCommand(Player p, Map m, String direction) {
		this.player = p;
		this.map = m;
		this.direction = direction;
	}
	
	@Override
	public void execute() {
		int currentRoom = player.getCurrentRoom();
		
		if(direction == "MOVE NORTH") {
			if(map.getRooms().get(currentRoom).getNorth() != -1) {
				player.setCurrentRoom(map.getRooms().get(currentRoom).getNorth());
			}
		}else if(direction == "MOVE SOUTH") {
			if(map.getRooms().get(currentRoom).getSouth() != -1) {
				player.setCurrentRoom(map.getRooms().get(currentRoom).getSouth());
			}
		}else if(direction == "MOVE EAST") {
			if(map.getRooms().get(currentRoom).getEast() != -1) {
				player.setCurrentRoom(map.getRooms().get(currentRoom).getEast());
			}
		}else if(direction == "MOVE WEST") {
			if(map.getRooms().get(currentRoom).getWest() != -1) {
				player.setCurrentRoom(map.getRooms().get(currentRoom).getWest());
			}
		}
	}
}
