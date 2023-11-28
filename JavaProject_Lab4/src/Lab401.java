import java.util.*;

public class Lab401 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y;
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		while(y <= x) {
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
		}
		System.out.println();
		int count = x+1, initialSum = x + count, newSum = 0;
		System.out.println(x + " + " + y + " = " + initialSum);
		count++;
		while(count <= y) {
			newSum = initialSum + count;
			System.out.println(initialSum + " + " + count + " = " + newSum);
			initialSum = newSum;
			count++;
		}
	}
}
