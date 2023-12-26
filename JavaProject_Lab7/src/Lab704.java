import javax.swing.*;

public class Lab704 {

	public static void main(String[] args) {
		String[] time = {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};
		String mBox = "";
		for(String _time : time) {
			mBox += "- " + _time + "\n";
		}
		JOptionPane.showMessageDialog(null, "The greeting words in English:\n" + mBox);
	}

}
