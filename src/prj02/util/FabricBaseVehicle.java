package prj02.util;

import prj02.model.Bus;
import prj02.model.Plane;
import prj02.model.Vehicle;

public class FabricBaseVehicle {
	public static Vehicle[] getMassOf2Items() {
		Vehicle[] masVeh = new Vehicle[2];
		masVeh[0] = new Bus(100, 5);
		masVeh[1] = new Plane(300, 800);
		return masVeh;
	}
	
}
