import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		int productUnit = Integer.parseInt(
				JOptionPane.showInputDialog("Input Product Unit:"));
		double pricePerUnit = Double.parseDouble(
				JOptionPane.showInputDialog("Input Price per unit:"));
		double totalPrice = productUnit * pricePerUnit;
		JOptionPane.showMessageDialog(null,
				"Total Price is " + frm.format(totalPrice) + " baht.\n" +
				"Add VAT 7% is " + frm.format(totalPrice*1.07) + " baht.");
	}

}
