package corejava.day01;

public class reversestring {

	public static void main(String[] args) {
		String str = "Java";
	
		/*	String rev = "";
		for(int i = str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
			
		}
		System.out.println(rev);
		
	

	} */



//Using StringBuilder

String rev = new StringBuilder(str)
         .reverse()
         .toString();
System.out.println(rev);
	}
}
