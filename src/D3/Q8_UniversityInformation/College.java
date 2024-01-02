package D3.Q8_UniversityInformation;

public class College extends University {
	@Override
	public void ug() {
		System.out.println("\nUg method in Child class; 3rd year ");
		super.ug();
	}
	@Override
	public void pg() {
		System.out.println("\nPg method in Child class: 1st year ");
		super.pg();
	}
	public static void main(String[] args) {
		College obj=new College();
		obj.ug();
		obj.pg();
	}
}
