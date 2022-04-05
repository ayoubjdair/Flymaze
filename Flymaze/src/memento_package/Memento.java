package memento_package;

import map_package.Map;
import player_package.Player;

public class Memento {
	public Player player;
	public Map map;

	public Memento (Player p, Map m){
		this.player = p;
		this.map = m;
	}
}
