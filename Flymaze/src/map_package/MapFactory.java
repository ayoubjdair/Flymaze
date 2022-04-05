package map_package;

public class MapFactory {

	public Map getMap(String difficulty) {
		
		if(difficulty == null) {
			return null;
		}
		if(difficulty == "EASY MAP") {
			return new EasyMap();
		} else if (difficulty == "HARD MAP") {
			return new HardMap();
		} else {
			System.out.print("Invalid input");
		}
		return null;
	}
}
