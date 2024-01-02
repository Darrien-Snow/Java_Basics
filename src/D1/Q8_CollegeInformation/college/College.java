package D1.Q8_CollegeInformation.college;

public class College {
	private void collegeName() {
		System.out.println("collegeName: ABC College");
	}
	private void collegeCode() {
		System.out.println("collegeCode: ABC 001");
	}
	private void collegeRank() {
		System.out.println("collegeRank: 76");
	}
	
	public static void main(String[] args) {
		College objCollege= new College();
		Student objStudent= new Student();
		Hostel objHostel= new Hostel();
		Dept objDept= new Dept();
	
		objCollege.collegeName();
		objCollege.collegeCode();
		objCollege.collegeRank();
		objStudent.studentName();
		objStudent.studentId();
		objStudent.studentDept();
		objHostel.hostelName();
		objDept.DeptdeptName();
	}
}
