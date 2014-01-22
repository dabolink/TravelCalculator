package Model;


public class Location {
	private String name;
	private String minimumTitle;
	private int id;
	private CheeseShoppe cheeseShoppe;
	private CharmShoppe charmShoppe;
	private GeneralStore generalStore;
	private Trapsmith trapsmith;
	private Cartographer cartographer;
	/**
	 *
	 * @param name
	 */
	public Location(String name){
		this.name = name;
	}
	/**
	 * 
	 * @param name
	 * @param minimumTitle
	 * @param id
	 */
	public Location(String name,String minimumTitle,int id){
		this.name = name;
		this.minimumTitle = minimumTitle;
		this.id = id;
	}
	/**
	 * 
	 * @return
	 */
	public boolean hasCheeseShoppe(){
		if(cheeseShoppe != null){
			return true;
		}
		return false;
	}
	public boolean hasCharmShoppe(){
		if(charmShoppe != null){
			return true;
		}
		return false;
	}
	public boolean hasCartographer(){
		if(cartographer != null){
			return true;
		}
		return false;
	}
	public boolean hasTrapsmith(){
		if(trapsmith != null){
			return true;
		}
		return false;
	}
	public boolean hasGeneralStore(){
		if(generalStore != null){
			return true;
		}
		return false;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String getMinimumTitle() {
		return this.minimumTitle;
	}
	public void setMinimumTitle(String minimumTitle) {
		this.minimumTitle = minimumTitle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Trapsmith getTrapsmith() {
		return trapsmith;
	}
	public void setTrapsmith(Trapsmith trapsmith) {
		this.trapsmith = trapsmith;
	}
	public GeneralStore getGeneralStore() {
		return generalStore;
	}
	public void setGeneralStore(GeneralStore generalStore) {
		this.generalStore = generalStore;
	}
	public CharmShoppe getCharmShoppe() {
		return charmShoppe;
	}
	/**
	 * 
	 * @param charmShoppe
	 */
	public void setCharmShoppe(CharmShoppe charmShoppe) {
		this.charmShoppe = charmShoppe;
	}
	public CheeseShoppe getCheeseShoppe() {
		return cheeseShoppe;
	}
	/**
	 * 
	 * @param cheeseShoppe
	 */
	public void setCheeseShoppe(CheeseShoppe cheeseShoppe) {
		this.cheeseShoppe = cheeseShoppe;
	}
	/**
	 * @return String
	 */
	public String toString(){
		return name + " " + minimumTitle + " " + id + " " + hasTrapsmith() + " " + hasCheeseShoppe() + " " + hasGeneralStore() + " " + hasCartographer() + " " + hasCharmShoppe();
		
	}
}
