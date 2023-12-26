import javax.swing.*;

public class Lab705 {

	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i = 0 ; i < array.length ; i++) {
		array[i] = Integer.parseInt(
				JOptionPane.showInputDialog("Input number " + (i+1)));
		}
		showEven(array);
		showOdd(array);
		}
	
	public static void showEven(int[] nums) {
		String displayNum = "";
		for(int _nums : nums)
			if(_nums %2 == 0)
				displayNum += _nums + " "; 
		JOptionPane.showMessageDialog(null, "List of even number:\n" + displayNum);
	}

	
	public static void showOdd(int[] nums) {
		String displayNum = "";
		for(int _nums : nums)
			if(_nums %2 != 0)
				displayNum += _nums + " "; 
		JOptionPane.showMessageDialog(null, "List of odd number:\n" + displayNum);
	}
	
	
}
