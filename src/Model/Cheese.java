package Model;

public class Cheese extends Item {
	int[] cost = new int[57];
	public Cheese(String name, int quantity, String description, boolean smashable){
		super(name, quantity, description, smashable);
	}
	
	public int getCost(int locationid){
		return cost[locationid];
	}
}
