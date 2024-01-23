
public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 // Customer's toString() 
		 System.out.println(c1);
		 // set customer's discount is 5 
		 c1.setDiscount(5);
		 // Customer's toString()
		 System.out.println(c1);
		 
		 Line();
		 // show customer's id
		 System.out.println("id is: " + c1.getID());
		 // show customer's name
		 System.out.println("name is: " + c1.getName());
		 // show customer's discount
		 System.out.println("discount is: " + c1.getDiscount());
		 Line();
		 System.out.println("###Test Invoice class###");
		 Invoice inv1 = new Invoice(101, c1, 12000.00);
		 // Invoice's toString()
		 System.out.println(inv1);
		 // set invoice's amount is 10000 
		 inv1.setAmount(10000);
		 // Invoice's toString()
		 System.out.println(inv1);		 
		 
		 Line();
		 // show invoice's id
		 // Customer's toString() by instance inv1
		 // show invoice's amount
		 Line();
		 // show customer's id by instance inv1
		 // show customer's name by instance inv1
		 // show customer's discount by instance inv1
		 // show invoice's amount after discount(format as output)
	}
	
	public static void Line() {
		for(int i = 1;i<=63;i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
