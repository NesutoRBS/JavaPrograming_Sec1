import javax.swing.*;

public class Lab601 {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Input your e-mail:");
		while(!checkEmail(email.toLowerCase())) {
			email = JOptionPane.showInputDialog("Input your e-mail:, again");
		}
		JOptionPane.showMessageDialog(null, "Your e-mail is " + email.toLowerCase());
	}
	
	public static boolean checkEmail(String email) {
		if(email.startsWith(" ")
				|| email.startsWith("@")
				|| (!(email.endsWith("@gmail.com"))
				&& !(email.endsWith("@hotmail.com"))))
			return false;
		else return true;
	}

}
