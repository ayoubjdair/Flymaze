package memento_package;

import com.sun.tools.javac.Main;

import lukes_package.Map;
import lukes_package.Memento;
import player_package.Player;

public class caretaker {
	
	Player p;
	Map m;

	Memento captureMemento() {
		Memento current = Main.createMemento();
	}
	
	
}
