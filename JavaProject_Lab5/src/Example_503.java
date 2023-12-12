import java.util.*;

public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!(sentence.endsWith(".")) || sentence.startsWith(" ")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int space = 0;
		for(int i = 0 ; i < sentence.length() ; i++)
			if(sentence.charAt(i) == ' ')
				space++;
		System.out.println("This sentence has " + space + " spacebar.");
		System.out.println("This sentence has " + (space+1) + " word.");
	}

}
