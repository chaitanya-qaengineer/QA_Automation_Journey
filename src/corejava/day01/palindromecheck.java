package corejava.day01;

public class palindromecheck {

	public static void main(String[] args) {
		String str = "Selenium";
		String rev = new StringBuilder(str)
				.reverse()
				.toString();
		//System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("The String is Plaindrome");
		}
		else {
			System.out.println("The String is not Palindrome");
		}

	}

}
