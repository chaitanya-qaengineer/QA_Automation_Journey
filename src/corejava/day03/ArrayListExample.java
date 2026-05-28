package corejava.day03;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<>();
	list.add("Chrome");
	list.add("Firefox");
	list.add("Edge");
	list.add("Safari");
	
	System.out.println("Available browsers are :" +list);
	for(String s : list) {
		if(s.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome browser is available");
		}
		
	}
	System.out.println("Total Browsers are :" +list.size());
		
	System.out.println("Second Browser is :" +list.get(1));


}
}
