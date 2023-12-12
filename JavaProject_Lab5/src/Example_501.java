import java.util.*;

public class Example_501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = "";
		String type;
		while(true) {
			System.out.print("Enter Word: ");
			type = scan.next();
			if(type.equalsIgnoreCase("Stop"))
					break;
			word = word.concat(type + " ");
		}
		System.out.print(word.toUpperCase());
	}
}
