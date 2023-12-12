import java.util.*;

public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		if (fullName.indexOf(' ') == -1) {
			System.out.print("Incorrect Name");
		}
		else {
			String firstName = fullName.trim().substring(0 , fullName.indexOf(' '));
			String lastName = fullName.trim().substring(fullName.indexOf(' ')+1);
			System.out.print("First Name: " 
							+ firstName.toUpperCase()
							+ "\nLast Name: "
							+ lastName.toLowerCase());
		}
	}
}
