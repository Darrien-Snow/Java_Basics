package D2.Q11_EducationInfomation;

public class Education extends Arts  {
	public void ug() {
		System.out.println("This is ug - child class");
	}
	public void pg() {
		System.out.println("This is pg - child class");
	}
	public static void main(String[] args) {
		Education obj=new Education ();
		obj.ug();
		obj.pg();
		obj.bA();
		obj.bBA();
		obj.bEd();
		obj.bsc();
		obj.bE();
		obj.bTech();
		obj.physiyo();
		obj.dental();
		obj.mbbs();
	}
}
