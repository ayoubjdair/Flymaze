package command_package;

import items_package.Item;
import items_package.Items;
import player_package.Player;

public class pickUpCommand implements commandInterface{
	
	Player player;
	Items item;
	
	public pickUpCommand (Player p, Items i) {
		this.player = p;
		this.item = i;
	}

	@Override
	public void execute() {
		player.addToInventory(item);
	}
	
}
