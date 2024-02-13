import java.util.*;
import java.io.*;

public class AddProduct {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		/*FileWriter filename = new FileWriter("d://txtFile//product.txt",true);
		PrintWriter writeFile = new PrintWriter(filename);*/
		
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt",true));
		
		System.out.print("Input Product Id    : ");
		String productID = input.next();
		System.out.print("Input Product Name  : ");
		String productName = input.next();
		System.out.print("Input Product Unit  : ");
		int productUnit = input.nextInt();
		System.out.print("Input Product Price : ");
		float productPrice = input.nextFloat();

		writeFile.println(productID + "," + productName + "," + productUnit + "," + productPrice);
		System.out.println("Save file already...");
		writeFile.close();
		
	}

}
