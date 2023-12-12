import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Name: ");
		String fullName = scan.nextLine();
		if (fullName.indexOf(' ') == -1) {
			System.out.print("Incorrect Name");
		}
		else {
			String firstName = fullName.trim().substring(0 , 1);
			String middleName = fullName.trim().substring(fullName.indexOf(' ') + 1, fullName.indexOf(' ') + 2);
			String lastName = fullName.trim().substring(fullName.lastIndexOf(' ') + 1);
			System.out.print(firstName + "."
							+ middleName + "."
							+ lastName + ".");
		}
	}
}
