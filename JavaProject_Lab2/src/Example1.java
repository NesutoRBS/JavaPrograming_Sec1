
public class Example1 {

	public static void main(String[] args) {
		String isbn = "IB2-6325-85-4-1", title = "Basic Java Programming";
		int unit = 5;
		double price = 225.75; //float price = 225.75f
		System.out.println("Book ISBN  : " + isbn);
		System.out.println("Book Title : " + title);
		System.out.println("Book Unit  : " + unit + " Books.");
		System.out.println("Book Price : " + price + " Baht.");
		System.out.println("--------------------------------");
		double totalPrice = unit * price;
		System.out.println("Total Price is " + totalPrice);
		double vatIncluded = totalPrice * 1.07;
		System.out.println("Add VAT 7%  is " + vatIncluded);
	}

}
