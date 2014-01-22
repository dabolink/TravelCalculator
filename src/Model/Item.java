package Model;

public class Item {
	private String name;
	private int quantity;
	private String description;
	boolean smashable;
	
	public Item(String name){
		this.name = name;
	}
	public Item(String name, int quantity, String description, boolean smashable){
		this.name = name;
		this.quantity = quantity;
		this.setDescription(description);
		this.smashable = smashable;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public String getName(){
		return this.name;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
