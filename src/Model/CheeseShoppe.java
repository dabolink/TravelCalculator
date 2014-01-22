package Model;

public class CheeseShoppe extends Shop{

	public CheeseShoppe(String name) {
		super(name);
	}
	public CheeseShoppe(String name, Item[] inventory){
		super(name, inventory);
	}
	public String toString(){
		return getName();
	}
}
