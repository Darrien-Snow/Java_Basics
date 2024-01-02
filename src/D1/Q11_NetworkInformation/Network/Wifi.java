package D1.Q11_NetworkInformation.Network;

public class Wifi {
	private void wifiName() {
		System.out.println("wifiName: JioFiber");
	}
	public static void main(String[] args) {
		Wifi objWifi=new Wifi();
		MobileData objMobileData= new MobileData();
		Lan objLan= new Lan();
		Wireless objWireless= new Wireless();
		
		objWifi.wifiName();
		objMobileData.dataName();
		objLan.lanName();
		objWireless.modamName();
	}
}
