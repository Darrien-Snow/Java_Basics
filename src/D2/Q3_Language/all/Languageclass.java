package D2.Q3_Language.all;

import D2.Q3_Language.english.English;

public class Languageclass extends English {
		private void allLanguages() {
			System.out.println("This is All Languages Class - Child");
		}
		public static void main(String[] args) {
			Languageclass objLanguage=new Languageclass();
			
			objLanguage.allLanguages();
			objLanguage.tamil();
			objLanguage.telgu();
			objLanguage.english();
		}
} 