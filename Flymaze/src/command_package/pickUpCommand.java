package command_package;

import items_package.Item;
import player_package.Player;

public class pickUpCommand implements commandInterface{
	
	Player player;
	Item item;
	
	public pickUpCommand (Player p, Item i) {
		this.player = p;
		this.item = i;
	}

	@Override
	public void execute() {
		player.addToInventory(item);
	}
	
}
