import java.text.*;
public class Example2 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double BUFFET = 299;
		int numberOfCustomer = 5;
		double netPrice = BUFFET * numberOfCustomer;
		System.out.println("Buffet of " + numberOfCustomer + 
							" customers is " + frm.format(netPrice));
		double serviceChargeIncluded = netPrice * 1.03;
		System.out.println("Add Service Charge 3% is " + 
							frm.format(serviceChargeIncluded));
	}

}
