import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int previousNumber, currentNumber;
		System.out.print("Input number : ");
		previousNumber = scan.nextInt();
		while(true){
			System.out.print("Input number : ");
			currentNumber = scan.nextInt();
			if (currentNumber < previousNumber) {
				System.out.println("\nBYE BYE");
				break;
			}
			previousNumber = currentNumber;
		}

	}

}
