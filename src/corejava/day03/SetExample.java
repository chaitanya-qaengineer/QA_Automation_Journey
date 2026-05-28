package corejava.day03;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Chrome");
        set.add("Firefox");
        set.add("Chrome");
        set.add("Edge");
        set.add("Firefox");
        System.out.println("The available browsers are : " +set);
        System.out.println("Tha number of browsers available are : " +set.size());
        
        for(String browser : set) {
        	if(browser.equals("Chrome")) {
        		System.out.println("Chrome is available");
        	}
        }

	}

}
