package Model;

public class Potion extends Item{
	private Cheese startCheese;
	private int startCheeseAmount;
	private Cheese endCheese;
	private int endCheeseAmount;
	private int cost;
	
	public Potion(int quantity, String name, int cost, Cheese startCheese, int startCheeseAmount, Cheese endCheese, int endCheeseAmount, String description, boolean smashable){
		super(name, quantity, description, smashable);
		this.startCheese = startCheese;
		this.startCheeseAmount = startCheeseAmount;
		this.endCheese = endCheese;
		this.startCheeseAmount = startCheeseAmount;
		this.cost = cost;
	}
}
