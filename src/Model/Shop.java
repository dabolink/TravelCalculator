package Model;

public class Shop {
	private String name;
	private Item[] inventory;
	
	public Shop(String name){
		this.name = name;
	}
	public Shop(String name, Item[] inventory){
		this.name = name;
		this.inventory = inventory;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setInventory(Item[] inventory){
		this.inventory = inventory;
	}
	public String getName(){
		return this.name;
	}
	public Item[] getInventory(){
		return this.inventory;
	}
}
