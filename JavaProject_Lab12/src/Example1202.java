import java.io.*;
import java.util.*;

public class Example1202 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Section: ");
		int requestSection = scan.nextInt();
		Header(requestSection);
		showListStudent(requestSection);
	} //end of method - main
	
	public static void showListStudent(int section) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String temp = "";
		while ((temp = readFile.readLine()) != null) {
			String[] data = temp.split("\t");
			int secCurrent = Integer.parseInt(data[3]);
			float midtermScore = Float.parseFloat(data[4]);
			float finalScore = Float.parseFloat(data[5]);
			if (secCurrent == section) {
				System.out.println(data[0] + "\t"
						+ data[2] + "\t"
						+ midtermScore + "\t"
						+ finalScore + "\t"
						+ findResult(midtermScore,finalScore));
			}
		}
		readFile.close();
	} //end of method - showListStudent
	
	public static String findResult(float Mid, float Final) {
		return (Mid + Final >= 40) ? "Pass" : "Fail";
	} //end of method - findResult
	
	public static void Header(int section) {
		System.out.println("*".repeat(70));
		System.out.println("\t\t\tList of Data for Section " + section);
		System.out.println("*".repeat(70));
	} // end of method - Header
	
} // end of class
