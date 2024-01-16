import java.util.*;
public class BookDemo {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.print("Input book title   : ");
		b1.setTitle(scan.nextLine());
		System.out.print("Input book price   : ");
		b1.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		b1.setPublishYear(scan.nextInt());
		System.out.print("\n" + b1);

	}

}
