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
		//Need method for this talk with Ayoub
		int currentRoom = player.getCurrentRoom();
		
		
		
	}
	
}
