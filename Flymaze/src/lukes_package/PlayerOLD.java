package lukes_package;

import java.util.ArrayList;
import enemy_package.Enemies;
import interceptor_package.ConcreteAttackInterceptor;

public class PlayerOLD {
	String name;
	int health;
	int stamina;
	private int attackStat;
	int currentRoom;
	String status;
	private ArrayList<Integer> inventory = new ArrayList<>();
	ConcreteAttackInterceptor attack = new ConcreteAttackInterceptor();
	
	//Constructors 
	public PlayerOLD() {	
	}
	
	public PlayerOLD(String name) {
		this.name = name;
		this.currentRoom = 0;
		this.status = "None";
	}

	
	//Getters
	public int getAttackStat() {
		return attackStat;
	}
	
	public ArrayList<Integer> getInventory() {
		return inventory;
	}

	public String getName() {
		return this.name;
	}
	
	public int getRoom() {
		return this.currentRoom;
	}
	
	
	//Setters
	public void setAttackStat(int attackStat) {
		this.attackStat = attackStat;
	}
	
	public void setInventory(ArrayList<Integer> inventory) {
		this.inventory = inventory;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRoom(int roomID) {
		this.currentRoom = roomID;
	}
	
	
	//Methods
	public void attack(Enemies e) {
		//This should be handled by dispatcher in main REVIEW LATER
		//attack.playerAtk(this, e);
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
