package D1.Q4_MyPhone.phone;

public class PhoneInfo {
	
	private void phoneName() {
	System.out.println("phoneName: IQOO");
	}
	private void phoneMieiNum() {
		System.out.println("phoneMieiNum: i90782349314");
		}
	private void Camera() {
		System.out.println("Camera: Sony 48");
		}
	private void storage() {
		System.out.println("storage: 128GB");
		}	
	private void osName() {
		System.out.println("osName: Android 13");
		}

public static void main (String[]args) {
	PhoneInfo OBJ=new PhoneInfo();
	
	OBJ.phoneName();
	OBJ.phoneMieiNum();
	OBJ.Camera();
	OBJ.storage();
	OBJ.osName();
}
}	
