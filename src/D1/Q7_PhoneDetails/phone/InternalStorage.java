package D1.Q7_PhoneDetails.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("processorName: SD870");		
	}

	private void ramSize() {
		System.out.println("ramSize: 6GB");		
	}
	
	public static void main(String[] args) {
		InternalStorage objInternalStorage= new InternalStorage();
		ExternalStorage objExternalStorage= new ExternalStorage();
		
		objInternalStorage.processorName();
		objInternalStorage.ramSize();
		objExternalStorage.size();
	}
}
