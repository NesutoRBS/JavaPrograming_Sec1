import java.util.*;

public class Lab604 {
	static Scanner scan = new Scanner(System.in);
	static String studentId;
	static int subjectId;
	public static void main(String[] args) {
		inputStudent();
	}
	
	public static void inputStudent() {
		System.out.print("Enter Student Id: ");
		studentId = scan.next();
		System.out.print("Enter Subject Id: ");
		subjectId = scan.nextInt();
		String subId = subjectId+"";
		while(!isLength(studentId,subId)) {
			System.out.print("Enter Student Id: ");
			studentId = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.nextInt();
			subId = subjectId+"";
		}
		System.out.println();
		displayData(isITStudent(studentId),isITSubject(subId));
	}
	
	public static boolean isLength(String stId, String sbId) {
		if (stId.length() == 10 && sbId.length() == 7)
			return true;
		else return false;
	}
	
	public static boolean isITStudent(String stId) {
		if (stId.substring(0,3).equals("211") && stId.substring(3,6).equals("311")) 
			return true;
		else return false;
	}
	
	public static boolean isITSubject(String sbId) {
		if (sbId.substring(0,2).equals("21") && sbId.substring(4,5).equals("1")) 
			return true;
		else return false;
	}
	public static void displayData(boolean student, boolean subject) {
		System.out.println(
				"Student id: "
				+ studentId
				+ (student?"":" is not ")
				+ " 1st year student in IT"
				+ ((student&&subject)?" and":"")
				+ ("\n")
				+ (subject?"E":"not e")
				+ "nroll in courses for Year 1"
				);
	}

}
