package corejava.day04;

public class MultipleCatchExample {

	public static void main(String[] args) {
		
		try {
			int i = 10/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled :" +e.getMessage());
			
		}
			
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled " +e);
		}
		
		
		try {
			String str = null;
			System.out.println(str.length());
			
		}
		catch(NullPointerException e) {
			System.out.println("Exception handled :" +e);
			
		}
		
		System.out.println("Program Continued");

	}
	

}
