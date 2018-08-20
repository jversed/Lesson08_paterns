package prj02;
import prj02.model.*;
import prj02.util.FabricBasePassenger;
import prj02.util.FabricBaseVehicle;
import prj02.util.PrintLib;

public class Program {

	public static void main(String[] args) {	
		
		
		Vehicle[] masVeh = FabricBaseVehicle.getMassOf2Items();
		IPassenger [] masPass = FabricBasePassenger.getMassOfItems(10);
	//	PrintLib.printMasVehicle(masVeh);
		PrintLib.printMasPassenger(masPass);

	}

}
