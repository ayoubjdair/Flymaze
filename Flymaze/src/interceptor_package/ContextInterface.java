package interceptor_package;

import enemy_package.Enemy;
import player_package.Player;

public interface ContextInterface {
//	public String applyDamage();
	
	public Player getPlayerObject();
	public Enemy getEnemyObject();
	
	public void setPlayerObject(Player p);
	public void setEnemyObject(Enemy e);
	
}
