package interceptor_package;

import enemy_package.Enemy;
import lukes_package.Player;

public class AttackContext implements ContextInterface{
	private Player playerObject;
	private Enemy enemyObject;
	
	public AttackContext(Player p, Enemy e) {
		this.playerObject = p;
		this.enemyObject = e;
	}
	
	
	
	public String applyDamage() {
		//The example is for use with a logger which might be handy
		String result = "Player:" + playerObject.getName() + " attacked Enemy:" + enemyObject.getName();
		
		return result;
		
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
