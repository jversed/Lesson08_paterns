package prj02.util;

import prj02.model.*;

public class PrintLib {
public static void printMasVehicle(Vehicle [] masVeh) {	
	for (Vehicle item : masVeh) {
		if (item instanceof Bus) {
			Bus b = ((Bus) item);
			System.out.print("This is Bus ... passenger = ");
			System.out.println(b.passenger);
		}
		if (item instanceof Plane) {
			Plane p = ((Plane) item);
			System.out.print("This is Plane ... high = ");
			System.out.println(p.high);
		}
	}
}

public static void printMasPassenger(IPassenger[] masPass) {
	for (IPassenger item : masPass) {
		System.out.print(item+" = ");
		System.out.println(item.getPassenger());
	}
	
}
}
