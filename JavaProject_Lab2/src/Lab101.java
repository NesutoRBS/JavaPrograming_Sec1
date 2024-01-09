import java.text.*;
import java.util.*;

public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Product Name   : ");
		String productName = scan.nextLine();
		System.out.print("Input Product unit   : ");
		int productUnit = scan.nextInt();
		System.out.print("Input Price per unit : ");
		double pricePerUnit = scan.nextDouble();
		System.out.println("---------------------------------------");
		double totalPrice = productUnit * pricePerUnit;
		System.out.println("Total Price is " + frm.format(totalPrice) + " baht.");
		System.out.println("---------------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = scan.nextInt();
		System.out.println("---------------------------------------");
		System.out.println("Discount from "+ discount + "(%)\t" + frm.format(totalPrice*discount/100) + " baht.");
		System.out.println("Amount to be paid \t" + frm.format(totalPrice*(100-discount)/100) + " baht.");
	}
}
