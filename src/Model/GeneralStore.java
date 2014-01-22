package Model;

public class GeneralStore extends Shop{

	public GeneralStore(String name) {
		super(name);
	}
	public GeneralStore(String name, Item[] inventory){
		super(name, inventory);
	}
	
}