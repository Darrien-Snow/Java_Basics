package D3.Test.MethodOverLoading_into_overRiding;

public class MethodOverloading {
//	public void test(int milk) {
//		System.out.println("old milk : 100");
//	}
	public void test(int EmpId,String EmpName) {
		System.out.println("Test - over loading\t"+"Old.EmpId 1: "+EmpId+"\t"+"Old.EmpName 1: "+EmpName);
	}
	public void test(int EmpID,String EmpName,long EmpPh) {
		System.out.println("Test - over loading\t"+"Old.EmpID 2: "+EmpID+"\t"
	+"Old.EmpName 2: "+EmpName+"\t"+"Old.EmpPh 2: "+EmpPh);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.test(116, "Snow");
		obj.test(200, "Mark", 22451245l);
//		obj.test(100);
		
	}
	
}

