import java.io.*;
import java.util.*;

public class ATMBanking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String accountNum,accountPass;
		int money;
		System.out.print("Enter account number  : ");
		accountNum = input.next();
		while(!(
				Character.isDigit(accountNum.charAt(0)) &&
				accountNum.substring(1,2).equals("-") &&
				Character.isDigit(accountNum.charAt(2)) &&
				Character.isDigit(accountNum.charAt(3)) &&
				Character.isDigit(accountNum.charAt(4)) &&
				accountNum.substring(5,6).equals("-") &&
				Character.isDigit(accountNum.charAt(6)) &&
				Character.isDigit(accountNum.charAt(7)) &&
				Character.isDigit(accountNum.charAt(8)) &&
				accountNum.substring(9,10).equals("-") &&
				Character.isDigit(accountNum.charAt(10)) &&
				Character.isDigit(accountNum.charAt(11)) &&
				accountNum.substring(12,13).equals("-") &&
				Character.isDigit(accountNum.charAt(13)) &&
				(accountNum.length() == 14)
				)
				)
		{
			System.out.print("Input wrong type, Enter account number  : ");
			accountNum = input.next();
		}
	}

}
