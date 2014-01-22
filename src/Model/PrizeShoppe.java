package Model;

public class PrizeShoppe extends Shop {

	public PrizeShoppe(String name) {
		super(name);
	}

	public PrizeShoppe(String name, Item[] inventory) {
		super(name, inventory);
	}
	public String toString(){
		return getName();
	}
}
