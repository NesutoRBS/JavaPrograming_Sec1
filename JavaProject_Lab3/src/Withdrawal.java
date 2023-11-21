import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 10000;
		int withdraw = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : " 
				+ balance 
				+ "\nInput money to withdraw"));
		if (withdraw > balance)
			JOptionPane.showMessageDialog(null,
					"Error: Cannot withdraw more than balance" 
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		else if (withdraw > 20000)
			JOptionPane.showMessageDialog(null,
					"Error: Cannot withdraw more than 20000" 
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		else if (withdraw % 100 != 0)
			JOptionPane.showMessageDialog(null,
					"Error: Cannot withdraw " + (withdraw%100) 
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,
					"You withdraw " 
					+ frm.format(withdraw) + " baht.\n"
					+ "1,000 = " + withdraw/1000 + "\n"
					+ "500 = " + withdraw%1000/500 + "\n"
					+ "100 = " + withdraw%1000%500/100 + "\n"
					);
	}

}
