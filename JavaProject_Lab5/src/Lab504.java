import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Text : ");
		String sentence = scan.nextLine();
		String forward = "";
		String reverse = "";
		for(int i = 0 ; i < sentence.length() ; i++) {
			if(sentence.charAt(i) == ' ')
				continue;
			else
				forward += sentence.charAt(i);
		}
		for(int i = forward.length()-1 ; i >= 0 ; i--) {
			if(forward.charAt(i) == ' ')
				continue;
			else
				reverse += forward.charAt(i);
		}
		if (reverse.trim().equalsIgnoreCase(forward.trim()))
			System.out.print("It is palindrome");
		else
			System.out.print("It is not palindrome");
	}

}
