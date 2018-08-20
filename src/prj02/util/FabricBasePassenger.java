package prj02.util;

import prj02.model.*;

public class FabricBasePassenger {
	private static final int COUNT_OF_ITEMS = 3;
	public static IPassenger[] getMassOf3Items() {
		IPassenger [] masPass = new IPassenger[3];
		masPass[0] = new Bus(100, 10);
		masPass[1] = new Ship(200, 900);
		masPass[2] = new House(30);
		return masPass;
	}
	public static IPassenger[] getMassOfItems(int n) {
		IPassenger [] masPass = new IPassenger[n];
		for (int i = 0; i < masPass.length; i++) {
			masPass[i] = next();
		}
		return masPass;
	}
	public static IPassenger next() {
		return getItem((int)(Math.random()*COUNT_OF_ITEMS));
	}
	public static IPassenger getItem(int n) {
		switch(n) {
		case 0: return new Bus(100, 10);
		case 1: return new Ship(200, 900);
		case 2: return new House(30);
		default: return null;
		}
		
	}
}
