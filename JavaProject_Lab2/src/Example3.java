import java.text.*;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input product name   : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = scan.nextInt();
		System.out.print("Input price per unit : ");
		double pricePerUnit = scan.nextDouble();
		System.out.println();
		double totalPrice = productUnit * pricePerUnit;
		System.out.println("Total Price is " + frm.format(totalPrice) + " baht.");
		System.out.println("Add VAT 7%  is " + frm.format(totalPrice * 1.07) + " baht.");
	}
}
