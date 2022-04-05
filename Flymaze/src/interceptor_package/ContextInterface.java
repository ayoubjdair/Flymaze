package interceptor_package;

import enemy_package.Enemy;
import player_package.Player;

public interface ContextInterface {
	
	//getters
	public Player getPlayerObject();
	public Enemy getEnemyObject();
	
	//setters
	public void setPlayerObject(Player p);
	public void setEnemyObject(Enemy e);
	
}
