import java.io.*;
import java.util.*;

public class Lab1205 {

	public static void main(String[] args) throws IOException{
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		Head();
		int i = 1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String firstName = readFile.next().substring(0,1);
			String lastName = readFile.next();
			double grade = readFile.nextDouble();
			readFile.next();
			System.out.println(i + ".\t"
					+ id + "\t"
					+ Level(id) + ("\t") 
					+ firstName + (".")
					+ lastName + ("\t")
					+ grade + ("\t")
					+ Status(grade));
			i++;
		}
		readFile.close();
	} // end of method - main

	public static void Head() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("*".repeat(64));
	} // end of method
	
	public static String Level(String id) {
		int year = 22 - Integer.parseInt(id.substring(0, 2));
		return year + "th";
	}
	
	public static String Status(double grade) {
		if (grade >= 2)
			return "Pass";
		else if (grade >= 1)
			return "Critical";
		else
			return "Retired";
	}
	
	
} // end of class
