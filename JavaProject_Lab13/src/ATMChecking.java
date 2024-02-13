import java.io.*;

public class ATMChecking extends ATMData {

	private int money;
	
	public ATMChecking(String ID, String Pass, int Money) {
		super(ID,Pass);
	}
	
	public boolean checkBookBank() {
		return false;
	}
	
	public void show() {
		
	}
	

}
