import java.util.*;

public class Lab701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[7];
		int oddNumberCount = 0;
		for(int i = 0; i < number.length; i++) {
			System.out.print("Input number " + (i+1) + " : ");
			number[i] = scan.nextInt();
			if (number[i] % 2 != 0)
				oddNumberCount++;
		}
		System.out.print("\nThere are " 
					+ oddNumberCount + " of odd number."
					+ "\nList of odd number : ");
		for (int _number : number) {
			if (_number % 2 != 0)
				System.out.print(_number + " ");
		}
		
	}

}
