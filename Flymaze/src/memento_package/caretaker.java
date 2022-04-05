package memento_package;


import java.util.ArrayList;

import game_package.Game;

public class caretaker {
	
	ArrayList<Memento> backupHistory = new ArrayList<Memento>();
	
	void captureMemento() {
		Memento current = Game.createMemento();
		backupHistory.add(current);
	}
	
	void restoreBackup() {
		if(backupHistory.size() < 0) {
			Game.restoreMemento(backupHistory.get(backupHistory.size()-1));
		}
	}
}
