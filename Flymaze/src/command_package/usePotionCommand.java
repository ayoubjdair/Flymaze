package command_package;

import items_package.PotionBuilder;
import player_package.Player;

public class usePotionCommand implements commandInterface{
	
	Player player;
	PotionBuilder potion;
	
	public usePotionCommand(Player p, PotionBuilder potion) {
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
