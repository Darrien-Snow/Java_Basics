package D1.Q9_VehicleInformation.allvehicle;

import D1.Q9_VehicleInformation.fourwheeler.FourWheeler;
import D1.Q9_VehicleInformation.threewheeler.ThreeWheeler;
import D1.Q9_VehicleInformation.twowheeler.TwoWheller;

public class Vehicle {
	private void VehicleNecessery() {
		System.out.println("VehicleNecessery:TamilNadu");
	}

	public static void main(String[] args) {
		Vehicle ObjVehicle=new Vehicle();
		ThreeWheeler objThreeWheeler= new ThreeWheeler();
		TwoWheller objTwoWheller= new TwoWheller();
		FourWheeler objFourWheeler= new FourWheeler(); 
		
		ObjVehicle.VehicleNecessery();
		objTwoWheller.cycle();
		objTwoWheller.bike();
		objThreeWheeler.Auto();
		objFourWheeler.car();
		objFourWheeler.bus();
		objFourWheeler.lorry();
	}
}
