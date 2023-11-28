import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Icecream {

	public static void main(String[] args) {
		final int VANILLA = 10,CHOCOLATE = 15,TOPPING = 5;
		int iceCreamFlavor;
		iceCreamFlavor = Integer.parseInt(
				JOptionPane.showInputDialog(
						"[1] Vanilla Flavor 10 B.\n"
						+ "[2] Chocolate Flavor 15 B.\n"
						+ "Press number to choose flavor:"));
		while(iceCreamFlavor != 1 && iceCreamFlavor != 2) // ใช้ while แทน if ในการตรวจสอบเงื่อนไข เนื่องจากโจทย์ไม่ให้ใช้ if
		{
			JOptionPane.showMessageDialog(null,
					"Error: Wrong choice!\nTry again..."
					,"ERROR",JOptionPane.ERROR_MESSAGE);
			iceCreamFlavor = Integer.parseInt(
					JOptionPane.showInputDialog(
							"[1] Vanilla Flavor 10 B.\n"
							+ "[2] Chocolate Flavor 15 B.\n"
							+ "Press number to choose flavor:"));
		}
		int topping = JOptionPane.showConfirmDialog(
				null,"Do you want to add topping",
				"Topping",JOptionPane.YES_NO_OPTION);
		int TotalPrice = 
				((iceCreamFlavor == 1) ? VANILLA : CHOCOLATE) + (topping == 0 ? TOPPING : 0); 
		JOptionPane.showMessageDialog(
				null, "You choose " 
				+ (iceCreamFlavor == 1 ? "Vanilla " : "Chocolate " + "Flavor")
				+ "\nAnd " + (topping == 0 ? "with topping" : "no topping")
				+ "\nTotal price = " + TotalPrice + " baht.");				
	}

}
