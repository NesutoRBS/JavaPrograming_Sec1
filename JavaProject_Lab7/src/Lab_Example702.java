import javax.swing.*;
public class Lab_Example702 {

	public static void main(String[] args) {
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		int itemNumber = Integer.parseInt(
				JOptionPane.showInputDialog("Enter item number to order"));
		boolean validItem = false;
		for(int i = 0; i < validValues.length; i++) {
			if (validValues[i] == itemNumber) {
				System.out.print("Item " + itemNumber + " is " + price[i]);
				validItem = true;
			}
		}
		if(!validItem)
			System.out.print("Invalid Item");
	}
}
