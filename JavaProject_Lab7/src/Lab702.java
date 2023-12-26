import java.text.DecimalFormat;
import java.util.*;

public class Lab702 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		double[] score = new double[5];
		double sum = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.print("Input score of student " + (i+1) + " : ");
			score[i] = scan.nextDouble();
			sum += score[i];
		}
		double average = sum/5;
		System.out.println("\nAverage of 5 student is " + frm.format(average));
		for(int i = 0; i < score.length; i++) {
			if(score[i] > average)
				System.out.println("> Student " + (i+1) + " (" + frm.format(score[i]) + ")");
		}
	}
}
