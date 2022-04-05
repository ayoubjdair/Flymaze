package command_package;

import items_package.Item;
import player_package.Player;

public class usePotionCommand implements commandInterface{
	
	Player player;
	Item potion;
	
	public usePotionCommand(Player p, Item potion) {
		this.player = p;
		this.potion = potion;
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
