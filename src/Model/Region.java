package Model;

public class Region {
	private Location[] locations;
	private String name;
	private int numOfLocations;
	public Region(String name){
		this.setName(name);
	}
	public Region(String name, Location[] locations, int numofLocations){
		this.setName(name);
		this.setLocations(locations);
		this.setNumOflocations(numofLocations);
	}
	public Location[] getLocations() {
		return locations;
	}
	public void setLocations(Location[] locations) {
		this.locations = locations;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOflocations() {
		return numOfLocations;
	}
	public void setNumOflocations(int numOflocations) {
		this.numOfLocations = numOflocations;
	}
	public void addLocation(Location location){
		numOfLocations++;
		Location[] temp = new Location[numOfLocations];
		for(int i=0;i<numOfLocations-1;i++){
			temp[i]=locations[i];
		}
		temp[numOfLocations-1]=location;
		locations = temp;
	}
	public String toString(){
		String toString = name;
		for(int i=0;i<numOfLocations;i++){
			toString += " " + locations[i].toString();
		}
		toString += " " + numOfLocations;
		return toString;
	}
}
