package Model;

public class Potion extends Item{
	private Cheese startCheese;
	private int startCheeseAmount;
	private Cheese endCheese;
	private int endCheeseAmount;
	private int cost;
	
	public Potion(int quantity, String name, int cost, Cheese startCheese, int startCheeseAmount, Cheese endCheese, int endCheeseAmount, String description, boolean smashable){
		super(name, quantity, description, smashable);
		this.setStartCheese(startCheese);
		this.setStartCheeseAmount(startCheeseAmount);
		this.setEndCheese(endCheese);
		this.setStartCheeseAmount(startCheeseAmount);
		this.setCost(cost);
	}

	public Cheese getStartCheese() {
		return startCheese;
	}

	public void setStartCheese(Cheese startCheese) {
		this.startCheese = startCheese;
	}

	public int getStartCheeseAmount() {
		return startCheeseAmount;
	}

	public void setStartCheeseAmount(int startCheeseAmount) {
		this.startCheeseAmount = startCheeseAmount;
	}

	public Cheese getEndCheese() {
		return endCheese;
	}

	public void setEndCheese(Cheese endCheese) {
		this.endCheese = endCheese;
	}

	public int getEndCheeseAmount() {
		return endCheeseAmount;
	}

	public void setEndCheeseAmount(int endCheeseAmount) {
		this.endCheeseAmount = endCheeseAmount;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
