
import java.util.Scanner;

public class PigLatinTranslatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the pig latin translator!!");

		Scanner sc = new Scanner(System.in);
		String choice = "Y";

		while(choice.equalsIgnoreCase("Y")) {
			System.out.print("Enter a phrase to be translated:  ");
			String toTranslate = sc.nextLine();

			String [] sepWords = toTranslate.split(" ");

			StringBuilder translated = new StringBuilder(100);

			String punctuation = "";

			for (String word: sepWords) {
				word.toLowerCase();

				if (word.endsWith(".") || word.endsWith("!") || word.endsWith("?")) {
					punctuation = word.substring(word.length()-1);
					word = word.substring(0, word.length()-1);
				}

				if (word.startsWith("a") || word.startsWith("e")|| word.startsWith("i") || 
						word.startsWith("o") || word.startsWith("u")) {
					translated.append(word + "way ");
				}else {
					char firstChar = word.charAt(0);
					word = word.substring(1);
					translated.append(word + firstChar + "ay ");
				}
			}
			
			System.out.println(translated.toString().trim() + punctuation);
		}

		System.out.println("Bye now!");
	}

}
