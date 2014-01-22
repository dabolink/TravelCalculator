package Model;

public class Player {
	private String title;
	private String username;
	private int gold;
	private int points;
	private Trap trap;
	private Location location;
	private int trapPower;
	public Player(String title, String username,int gold,int points,Trap trap, Location location){
		this.setTitle(title);
		this.setUsername(username);
		this.setGold(gold);
		this.setPoints(points);
		this.setTrap(trap);
		this.setLocation(location);
	}
	public int getTrapPower() {
		return trapPower;
	}
	public void setTrapPower(int trapPower) {
		this.trapPower = trapPower;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Trap getTrap() {
		return trap;
	}
	public void setTrap(Trap trap) {
		this.trap = trap;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
