package D1.Q5_LanguageDetails.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("southIndia: Tamilnadu, Kerala, Andra, Karnataka");
	}
	private void northIndia() {
		System.out.println("northIndia: Maharastra, Jarkhand, kolkat");
	}

	public static void main(String[] args) {
		StateDetails objState=new StateDetails ();
		LanguageInfo objLanguage=new LanguageInfo();
		
		objState.southIndia();
		objState.northIndia();
		
		objLanguage.tamilLanguage();
		objLanguage.englishLanguage();
		objLanguage.hindiLanguage();
	}
}
