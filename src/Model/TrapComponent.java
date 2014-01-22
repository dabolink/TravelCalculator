package Model;

public class TrapComponent extends Item{
	private int power;
	private int powerBonus;
	private int attractionBonus;
	private int luck;
	private String cheeseEffect;
	public TrapComponent(String name, int quantity, String description,
			boolean smashable,int power,int powerBonus,int attractionBonus,int luck,String cheeseEffect) {
		super(name, quantity, description, smashable);
		this.setPower(power);
		this.setPowerBonus(powerBonus);
		this.setAttractionBonus(attractionBonus);
		this.setLuck(luck);
		this.setCheeseEffect(cheeseEffect);
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getPowerBonus() {
		return powerBonus;
	}
	public void setPowerBonus(int powerBonus) {
		this.powerBonus = powerBonus;
	}
	public int getAttractionBonus() {
		return attractionBonus;
	}
	public void setAttractionBonus(int attractionBonus) {
		this.attractionBonus = attractionBonus;
	}
	public int getLuck() {
		return luck;
	}
	public void setLuck(int luck) {
		this.luck = luck;
	}
	public String getCheeseEffect() {
		return cheeseEffect;
	}
	public void setCheeseEffect(String cheeseEffect) {
		this.cheeseEffect = cheeseEffect;
	}


}
