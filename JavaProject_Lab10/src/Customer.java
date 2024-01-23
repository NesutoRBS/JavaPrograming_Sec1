
public class Customer {
	private int id;
	private String name;
	private int discount;

	//Default Constructor
	public Customer() {
		this.id = 0;
		this.name = "";
		this.discount = 0;
	}
	
	//Constructor with Parameter
	public Customer(int id,String name,int discount) {
		this.id = id;
		this.name = name;
		setDiscount(discount);
	}
	
	//getID
	public int getID() {
		return this.id;
	}
	
	//getName
	public String getName() {
		return this.name;
	}
	
	//getDiscount
	public int getDiscount() {
		return this.discount;
	}
	
	//setDiscount
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	//toString
	public String toString() {
		return this.name + "(" + this.id + ")" + "(" + this.discount + "%)";
	}
	
}
