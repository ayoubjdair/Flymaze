package lukes_package;

public class MementoOLD {

	PlayerOLD playerSave;
	Map mapSave;
	
	
	public void restoreState(PlayerOLD p, Map m) {
		p = playerSave;
		m = mapSave;
	}
	
	public void savePLayer(PlayerOLD p) {
		playerSave = p;
	}
	
	public void saveMap(Map m) {
		mapSave = m;
	}
	
}
