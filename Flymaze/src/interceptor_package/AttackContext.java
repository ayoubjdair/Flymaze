package interceptor_package;

import enemy_package.Enemy;
import player_package.Player;

public class AttackContext implements ContextInterface{
	private Player playerObject;
	private Enemy enemyObject;
	
	public AttackContext(Player p, Enemy e) {
		this.playerObject = p;
		this.enemyObject = e;
	}

	@Override
	public Player getPlayerObject() {
		return this.playerObject;
	}

	@Override
	public Enemy getEnemyObject() {
		return this.enemyObject;
	}

	@Override
	public void setPlayerObject(Player p) {
		this.playerObject = p;
	}

	@Override
	public void setEnemyObject(Enemy e) {
		this.enemyObject = e;
	}
}