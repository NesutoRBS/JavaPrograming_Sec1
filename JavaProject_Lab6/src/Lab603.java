import java.util.Scanner;

public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullName = scan.nextLine();
		System.out.println(abbreviatName(fullName));

	}
	
	public static String abbreviatName(String fName) {
		String firstName = fName.substring(0 , fName.indexOf(' '));
		String middleName = fName.substring(fName.indexOf(' ') + 1, fName.indexOf(' ') + 2);
		String lastName = fName.substring(fName.lastIndexOf(' ') + 1,fName.lastIndexOf(' ') + 2);
		return middleName + "." + lastName + "." + firstName;
				
		}
	}
