package interceptor_package;

public class ConcreteAttackInterceptor implements Interceptor{
	
	public void playerAtk(ContextInterface context) {
		int attackStrength = context.getPlayerObject().getAttackStat();
		
		if(context.getPlayerObject().getInventory().size() > 0) {
			for(int i = 0; i < context.getPlayerObject().getInventory().size(); i++) {
				//This can be changed based on how Ayoub implements Items
				attackStrength += context.getPlayerObject().getInventory().get(i).power;
			}
		}
		
		context.getEnemyObject().setHealth(context.getEnemyObject().getHealth()-attackStrength);
	}
	
	
	
	

//	public void playerAtk(Player p, Enemies e) {
//		int attackStrength = p.getAttackStat();
//		
//		if(p.getInventory().size() > 0) {
//			for(int i = 0; i < p.getInventory().size(); i++) {
//				//This can be changed based on how Ayoub implements Items
//				attackStrength += p.getInventory().get(i);
//			}
//		}
//		
//		e.setHealth(e.getHealth()-attackStrength);
//		
//	}
	
	
	
	
	
}
