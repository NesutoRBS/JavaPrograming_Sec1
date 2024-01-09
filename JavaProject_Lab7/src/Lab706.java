import javax.swing.*;

public class Lab706 {
	
	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int inputNum = Integer.parseInt(
				JOptionPane.showInputDialog("Input index of array:"));
		while(!checkIndex(nums,inputNum)) {
			inputNum = Integer.parseInt(
					JOptionPane.showInputDialog("Input index of array, again:"));
		}
		
		int currentValue = currentData(nums,inputNum);
		int prevValue = prevData(nums,inputNum);
		int nextValue = nextData(nums,inputNum);
		
		JOptionPane.showMessageDialog(null,
				"Current data, nums[" + inputNum + "] is " + currentValue +
				( (prevData(nums,inputNum) >= 0) ?
						("\nPrevious data, nums[" + prevValue + "] is " + nums[prevValue])
						:("\nNo previous Data")) +
				( (nextData(nums,inputNum) < 7)?
						("\nNext data, nums[" + nextValue + "] is " + nums[nextValue])
						: ("\nNo next Data"))
				);

	}
	
	public static boolean checkIndex(int[] nums, int index) {
		return (index >= 0 && index < nums.length) ? true : false; 
	}
	
	public static int currentData(int[] nums, int index) {
		return nums[index];
	}
	
	public static int prevData(int[] nums, int index) {
		return index-1;
	}
	
	public static int nextData(int[] nums, int index) {
		return index+1;
	}

}

