package D3.Q4_MyPhone;

public class Phone {
	public void phoneInfo(int Storage, String ModelNo) {
		System.out.println("int Storage:" +Storage +"\n"+ "String ModelNo"+ModelNo+"\n");
	}
	public void phoneInfo(String Storage, int ModelNo) {
		System.out.println("String Storage:" +Storage +"\n"+ "int ModelNo:"+ModelNo+"\n");
	}
	public void phoneInfo(long Storage, float ModelNo,double OS,char Number) {
		System.out.println("long Storage:" +Storage +"\n"+ "float ModelNo: "+ModelNo+"\n"
				+"double OS:" +OS +"\n"+ "char letter: "+Number+"\n");
	}
	public void phoneInfo(float Storage, long ModelNo,double OS,char Number) {
		System.out.println("float Storage:" +Storage +"\n"+ "long ModelNo: "+ModelNo+"\n"
				+"double OS:" +OS +"\n"+ "char letter: "+Number+"\n");
	}
	public static void main(String[] args) {
		Phone obj=new Phone();
		obj.phoneInfo(128, "Iqoo9");
		obj.phoneInfo ("Iqoo 9", 128);
		obj.phoneInfo(3513661l, 12.04f, 13.78459,'Q');
		obj.phoneInfo(128.2f,293l , 32512.13251, '9');
	}
}
