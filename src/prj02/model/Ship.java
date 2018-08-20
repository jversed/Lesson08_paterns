package prj02.model;

public class Ship extends Vehicle implements IPassenger{
	public int passenger;
	public Ship(int speed, int passenger) {
		super(speed);
		this.passenger = passenger;
	}
	@Override
	public int getPassenger() {		
		return passenger;
	}
}
