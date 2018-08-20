package prj02.model;

public class Vehicle {
	public int speed;

	public Vehicle(int speed) {
		super();
		this.speed = speed;
	}

	public Vehicle() {
		super();
		System.out.println("Build Vehicle....");
	}
}
