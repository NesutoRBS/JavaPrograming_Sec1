
public class ATMData {
	private String accountNumber;
	private String password;
	
	public ATMData(String ID,String Pass) {
		this.accountNumber = ID;
		this.password = Pass;
	}
	
	public String getID() {
		return this.accountNumber;
	}
	
	public String getPass() {
		return this.password;
	}

}
