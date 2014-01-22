
public class Location {
	private String name;
	private boolean hasCheeseS,hasTrapS,hasGeneralS,hasCart,hasCharmS;
	
	public Location(String name, boolean hasCheS, boolean TS, boolean hasGS, boolean hasChaS){
		this.name = name;
		hasCheeseS = hasTrapS = hasGeneralS = hasCart = hasCharmS = false;
	}
	public Location(String name){
		this.name = name;
	}
}
