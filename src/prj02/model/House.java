package prj02.model;

public class House implements IPassenger{
	private int inhabitants;
	public House(int inhabitants) {
		this.setInhabitants(inhabitants);
	//	this.inhabitants = inhabitants;
	}
	public int getInhabitants() {
		return inhabitants;
	}
	public void setInhabitants(int inhabitants) {
		this.inhabitants = inhabitants;
	}
	@Override
	public int getPassenger() {		
		return getInhabitants();
	}
	
}
