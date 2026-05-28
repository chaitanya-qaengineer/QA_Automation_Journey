package corejava.day03;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Chrome");
        list.add("Firefox");
        list.add("Edge");
        list.add("Safari");
	
        
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        


        
	}

}
