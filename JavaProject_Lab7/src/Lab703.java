import java.util.*;

public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = {78,36,58,41,25,92,75};
		System.out.print("Input index of array : ");
		int inputNum = scan.nextInt();
		while(inputNum < 0 || inputNum > 6) {
			System.out.print("Input index of array, again : ");
			inputNum = scan.nextInt();
		}
		System.out.print("\nValue in current index is " + array[inputNum]);
		if (inputNum != (array.length-1))
			System.out.print("\nValue in next    index is " + array[inputNum+1]);
		else
			System.out.print("\nSorry, " + inputNum + " is the last index in array.");
	}
}
