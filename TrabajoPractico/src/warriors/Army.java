package warriors;

import java.util.PriorityQueue;

public class Army extends MilitaryUnit {
	
	private PriorityQueue<MilitaryUnit> army;
	
	public void addMilitaryUnit(MilitaryUnit other) {
		this.army.add(other);
	}
	
	@Override
	public void attack(Warrior anotherWarrior) {
		army.peek().attack(anotherWarrior);
	}

	@Override
	public void receiveAttack(double damage) {
		army.peek().receiveAttack(damage);
	}

	@Override
	public void rest() {
		army.peek().rest();
	}
}
