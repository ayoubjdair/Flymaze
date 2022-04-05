package command_package;

import map_package.Map;

public class showMapCommand implements commandInterface{

	Map map;
	
	public showMapCommand(Map m) {
		this.map = m;
	}
	
	@Override
	public void execute() {
		System.out.println(map.showMap());
	}
}
