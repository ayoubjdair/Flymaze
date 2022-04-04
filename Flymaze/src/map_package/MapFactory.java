package lukes_package;

public class MapFactory {

	public Map getMap(String difficulty) {
		
		if(difficulty == null) {
			return null;
		}
		
		//Possibly come back to make this case insensitive
		if(difficulty == "Easy") {
			return new EasyMap();
		} else if (difficulty == "Hard") {
			return new HardMap();
		} else {
			System.out.print("Invalid input");
		}
			
			
		return null;
	}
	
	
}
