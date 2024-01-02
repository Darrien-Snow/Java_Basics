package D3.Test.MethodOverLoading_into_overRiding;

public class MethodOverRiding extends MethodOverloading {
	
//	@Override
//		public void test(int milk) {
//			System.out.println("New Child: over rided: ");
//			super.test(milk);
//		}
	
	@Override
	public void test(int EmpId, String EmpName) {
		System.out.println("Test - over riding\t"+"New.EmpId 1: "+EmpId+"\tNew.EmpName 1: "+EmpName+"\t");
//		super.test(EmpId, EmpName);
	}
		
	@Override
	public void test(int EmpId, String EmpName, long EmpPh) {
		System.out.println("Test - over riding\t"+"New.EmpId 2: "+EmpId+"\t"
				+"New.EmpName 2: "+EmpName+"\t"+"New.EmpPh 2: "+EmpPh);
//		super.test(EmpId, EmpName, EmpPh);
	}
	
	
	public static void main(String[] args) {
		MethodOverRiding ObjOverRide=new MethodOverRiding();
		ObjOverRide.test(526, "DarrienSnow");
		ObjOverRide.test(701, "Mark Antony", 54246164378l);
//		ObjOverRide.test(900);
	}
}
