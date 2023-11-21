import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		final int BUFFET = 299;
		int customerPerBill = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill?"));
		double totalPrice = BUFFET*customerPerBill;
		int option;
		do
		{
			option = JOptionPane.showConfirmDialog(
			null,"Total Price is " 
				+ frm.format(totalPrice) 
				+ " baht.\n" 
				+ "Do you have a member card?"
				);
		} while (option == JOptionPane.CANCEL_OPTION);
		JOptionPane.showMessageDialog(
				null, "Amount to be paid is "
				+ (option == JOptionPane.YES_OPTION 
				? frm.format(totalPrice*0.9) 
				: frm.format(totalPrice))
				);
		}
	}

