import java.io.*;
import java.util.*;

public class Lab1202 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		System.out.print("Input E-Mail: ");
		String requestEmail = scan.next();
		boolean checked = false;
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String email = readFile.next();
			if (requestEmail.equalsIgnoreCase(email)) {
				System.out.println("Your password is " + password);
				checked = true;
				break;
			}
		}
		if (!checked)
			System.out.println("The data not found...");
		readFile.close();
	}

}
