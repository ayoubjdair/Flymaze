import java.util.Map;

import player_package.Player;
import room_package.RoomFactory;
import testing_package.AutomatedTesting;

public class Main {
	
	RoomFactory roomFactory = new RoomFactory();
	//Get Ayoub to have a look at this
	 static Player player = new Player();
	 //Add check to see if player chose easy or hard map then generate
	 static Map map;
	
	
	//Need to create dispatcher object here I think
	//This then keep track of any interceptors that may apply so when the command
	//Is given to attack the new interceptor is added to the list
	//Then the dispatcher runs through the list of interceptors and applys them
	//using the provided context object
		
		
	// }

	public static void main(String[] args){

		AutomatedTesting tester = new AutomatedTesting();
		tester.testItemBuilder();
		tester.testPlayerBuilder();
		tester.testComposite();
    }

	public static Memento createMemento() {
		
		Memento memento = new Memento(player, map);
		
	}
	
	public static void restoreMemento(Memento m) {
		
		player = m.player;
		map = m.map;
		
	}
	
	
	
}

class Memento {
	Player player;
	Map map;

	Memento (Player p, Map m){
		this.player = p;
		this.map = m;
	}

}
