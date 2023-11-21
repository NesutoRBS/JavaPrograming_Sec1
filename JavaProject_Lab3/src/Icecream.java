import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Icecream {

	public static void main(String[] args) {
		final int VANILLA = 10,CHOCOLATE = 15,TOPPING = 5;
		int iceCreamFlavor;
		do {
		iceCreamFlavor = Integer.parseInt(
				JOptionPane.showInputDialog(
						"[1] Vanilla Flavor 10 B.\n"
						+ "[2] Chocolate Flavor 15 B.\n"
						+ "Press number to choose flavor:"));
		if(iceCreamFlavor != 1 && iceCreamFlavor !=2)
			JOptionPane.showMessageDialog(null,
					"Error: Wrong choice!\nTry again..."
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		} while(iceCreamFlavor != 1 && iceCreamFlavor != 2);
		int topping = JOptionPane.showConfirmDialog(
				null,"Do you want to add topping",
				"Topping",JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(
				null, "You choose " 
				+ (iceCreamFlavor == 1?"Vanilla Flavor":"Chocolate Flavor"))
				+ "And " + (topping == JOptionPane.YES_OPTION ? "with topping" : "no topping")
				+ "\nTotal price = " + 
		
		);
	}

}
