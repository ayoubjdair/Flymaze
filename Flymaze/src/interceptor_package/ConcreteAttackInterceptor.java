package interceptor_package;

public class ConcreteAttackInterceptor implements Interceptor{
	
	public void playerAtk(ContextInterface context) {
		int attackStrength = context.getPlayerObject().getAttackStat();
		
		if(context.getPlayerObject().getInventory().size() > 0) {
			for(int i = 0; i < context.getPlayerObject().getInventory().size(); i++) {
				//This can be changed based on how Ayoub implements Items
				attackStrength += context.getPlayerObject().getInventory().get(i).getPower();
			}
		}
		context.getEnemyObject().setHealth(context.getEnemyObject().getHealth()-attackStrength);
	}
}
