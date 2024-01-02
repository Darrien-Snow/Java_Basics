package D2.Q7_languageDetails;

public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("This is tamilLanguage Class - Child");
	}
	private void englishLanguage() {
		System.out.println("This is englishLanguage Class - Child");
	}
	private void hindiLanguage() {
		System.out.println("This is hindiLanguage Class - Child");
	}
	public static void main(String[] args) {
		LanguageInfo obj=new LanguageInfo();
		obj.tamilLanguage();
		obj.hindiLanguage();
		obj.englishLanguage();
		obj.northIndia();
		obj.southIndia();
	
	}
}
