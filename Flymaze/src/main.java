import room_package.RoomFactory;
import testing_package.AutomatedTesting;

public class Main {
	
	RoomFactory roomFactory = new RoomFactory();
	// Memento saveState = new Memento();
	// static Player player = new Player();
	// static Map map;
	
	// public static void main(String[] args) {
	// 	//Needs to generate map and rooms accordingly 
	// 	//Generates player object before starting game
	
	
	//Need to create dispatcher object here I think
	//This then keep track of any interceptors that may apply so when the command
	//Is given to attack the new interceptor is added to the list
	//Then the dispatcher runs through the list of interceptors and applys them
	//using the provided context object
		
		
	// }

	// private static void restoreState(Memento m) {
	// 	m.restoreState(player, map);
	// 	//This should be all the relevant data needed to restore the game state to the required point
	// }

	public static void main(String[] args){

		AutomatedTesting tester = new AutomatedTesting();
		tester.testItemBuilder();
		tester.testPlayerBuilder();
		tester.testComposite();
    }

}
