package corejava.day04;

public class TryCatchExample {
	public static void main(String[] args) {
	try {
	
	int i = 10/0;
    System.out.println(i);

	}
	catch(ArithmeticException e) {
		System.out.println("Exception handled :" +e.getMessage());
		
		
	}
	System.out.println("Program Execution continues");
	}
	
	

}
