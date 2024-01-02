package D2.Q4_SouthIndia.india;

import D2.Q4_SouthIndia.Tamilnadu.TamilNadu;

public class India extends TamilNadu {
	private void india() {
		System.out.println("This is India Class - Child");

	}
	public static void main(String[] args) {
		India obj=new India();
		
		obj.india();
		obj.tamilNadu();
		obj.andhraPradesh();
		obj.kerala();
				
	}

}
