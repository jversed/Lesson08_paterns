package prj02.model;

public class Bus extends Vehicle implements IPassenger {
	public int passenger;
	public Bus(int speed, int passenger) {
		super(speed);
		this.passenger = passenger;
	}
	public Bus() {
		super();
		System.out.println("Build Bus....");
	}
	@Override
	public int getPassenger() {		
		return passenger;
	}
	@Override
	public String toString() {
		return "Bus [passenger=" + passenger + "]";
	}
	
}
