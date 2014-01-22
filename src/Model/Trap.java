package Model;

public class Trap {
	private Weapon weapon;
	private Base base;
	private Charm charm;
	private int totalPower;
	private int totalAttractionBonus;
	private int totalLuck;
	private boolean goldenShield;
	
	public Trap(Weapon weapon,Base base,Charm charm,boolean goldenShield){
		this.weapon = weapon;
		this.base = base;
		this.charm = charm;
		this.goldenShield = goldenShield;
		calculateTotals();
	}
	private void calculateTotals() {
		totalPower = (base.getPower() + weapon.getPower())*(1+base.getPowerBonus()+weapon.getPowerBonus());
		totalAttractionBonus = base.getAttractionBonus() + weapon.getAttractionBonus();
		totalLuck = weapon.getLuck() + base.getLuck();
		if(goldenShield){
			totalLuck += 7;
		}
		
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public Base getBase() {
		return base;
	}
	public void setBase(Base base) {
		this.base = base;
	}
	public Charm getCharm() {
		return charm;
	}
	public void setCharm(Charm charm) {
		this.charm = charm;
	}
	public int getTotalPower() {
		return totalPower;
	}
	public void setTotalPower(int totalPower) {
		this.totalPower = totalPower;
	}
	public int getTotalAttractionBonus() {
		return totalAttractionBonus;
	}
	public void setTotalAttractionBonus(int totalAttractionBonus) {
		this.totalAttractionBonus = totalAttractionBonus;
	}
	public int getTotalLuck() {
		return totalLuck;
	}
	public void setTotalLuck(int totalLuck) {
		this.totalLuck = totalLuck;
	}
	
}
