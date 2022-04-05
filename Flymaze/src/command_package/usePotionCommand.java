package command_package;

import items_package.Item;
import items_package.Items;
import player_package.Player;

public class usePotionCommand implements commandInterface{
	
	Player player;
	Items potion;
	
	public usePotionCommand(Player p, Items items) {
		this.player = p;
		this.potion = items;
	}
	
	@Override
	public void execute() {
		int level = this.potion.getLevel();
		
		if(level == 1) {
			player.setHealth(player.getHealth() + 15);
		}else if(level == 2) {
			player.setHealth(player.getHealth() + 25);
		}
	}
}
