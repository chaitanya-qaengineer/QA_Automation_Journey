package corejava.day02;

public class LargestNumber {

	public static void main(String[] args) {
		int[] nums = {3,6,7,2,9};
		int largest = nums[0];
		for(int i : nums) {
			if(i>largest) {
				largest = i;
			}
		}
		System.out.println(largest);

	}

}
