package memento_package;


import java.util.ArrayList;

import game_package.Game;

public class Caretaker {
	
	private static Caretaker firstInstance = null;
	
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
	
	public static Caretaker getInstance()
    {
        if(firstInstance == null)
        {
            firstInstance = new Caretaker();
        }
        return firstInstance;
    }
}
