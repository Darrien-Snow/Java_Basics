package D1.Q10_TransportInformation.transport;
import D1.Q10_TransportInformation.air.Air;
import D1.Q10_TransportInformation.road.Road;
import D1.Q10_TransportInformation.water.Water;

public class Transport {
	private void TransportForm() {
		System.out.println("TransportForm: TamilNadu");
	}
	
	public static void main(String[] args) {
		Transport objTransport=new Transport();
		Water objWater= new Water();
		Road objRoad= new Road();
		Air objAir= new Air();
		
		objTransport.TransportForm();
		objRoad.bike();
		objRoad.cycle();
		objRoad.car();
		objRoad.bus();
		objWater.boat();
		objWater.ship();
		objAir.aeroPlane();
		objAir.heliCopter();
	}
}
