package corejava.day01;

public class LargestNumber {

	
	public static void main(String[] args) {
		int[] arr = {10,60,35,58,29};
		int lar = 0;
		
		for(int i : arr) {
			if(i>lar) {
				lar = i;
				}
			
		}
		System.out.println(lar);

	}

}
