package D2.Q5_CollegeInformation;

public class Student extends College {
	private void student() {
		System.out.println("This is Student Class - Child");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.student();
		obj.college();
		obj.dept();
		obj.hostel();
			
	}
}
