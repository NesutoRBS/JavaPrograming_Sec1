import java.text.DecimalFormat;
import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		int taxableIncome;
		double taxPayable;
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("$0.00"); // JAVA STYLE
		System.out.print("Enter the taxable income: $");
		taxableIncome = scan.nextInt();
		if(taxableIncome <= 20000)
			taxPayable = 0;
		else if(taxableIncome <= 40000)
			taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K;
		else if(taxableIncome <= 60000)
			taxPayable = 2000 + (taxableIncome-40000)*TAX_RATE_ABOVE_40K;
		else
			taxPayable = 6000 + (taxableIncome-60000)*TAX_RATE_ABOVE_60K;
		//System.out.print("The income tax payable is: " + frm.format(taxPayable) + "\n"); JAVA STYLE
		System.out.printf("The income tax payable is: $%.2f",taxPayable); // C Style
	}
}
