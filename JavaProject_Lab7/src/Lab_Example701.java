
public class Lab_Example701 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		System.out.println("Using \"FOR\" to display value");
		for(int i = 0; i < nums.length; i++) {
			System.out.println("nums["+ i +"] = " + nums[i]);
		}
		
		//USING FOREACH
		
		System.out.println("\nUsing \"FOREACH\" to display value");
		int j = 0;
		for(int _num : nums) {
			System.out.println("nums["+ j +"] = " + nums[j]);
			j++;
		}

		//METHOD
		printArrayNumber(nums);
	}
	public static void printArrayNumber(int[] number) {
		System.out.println("\nUsing \"METHOD\" to display value");
		int k = 0;
		for(int _number : number) {
			System.out.println("nums["+ k +"] = " + number[k]);
			k++;
		}
	}

}
