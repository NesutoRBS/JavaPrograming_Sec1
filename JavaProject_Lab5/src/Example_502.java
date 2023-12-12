import javax.swing.JOptionPane;

public class Example_502 {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Input your e-mail:");
		email = email.toLowerCase();
		while(email.startsWith(" ")
				|| email.startsWith("@")
				|| (!(email.endsWith("@gmail.com"))
				&& !(email.endsWith("@hotmail.com")))
				 ) {
			if(!(email.endsWith("@gmail.com")
				&& email.endsWith("@hotmail.com"))) {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
			}
			email = JOptionPane.showInputDialog("Input your e-mail,again:");
			email = email.toLowerCase();
		}
		JOptionPane.showMessageDialog(null, "Your e-mail is " + email);
	}
}
