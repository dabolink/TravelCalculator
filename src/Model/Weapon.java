package Model;

public class Weapon extends TrapComponent{
	public Weapon(String name, int quantity, String description,
			boolean smashable, int power, int powerBonus, int attractionBonus,
			int luck, String cheeseEffect) {
		super(name, quantity, description, smashable, power, powerBonus,
				attractionBonus, luck, cheeseEffect);
	}
}
