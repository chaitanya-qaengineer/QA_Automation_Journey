package corejava.day01;

import java.util.HashMap;

public class CharacterFrequency {

	public static void main(String[] args) {
		String str = "HelloJello";
		char[] arr = str.toCharArray();	
        HashMap<Character, Integer> map = new HashMap<>();

		for(char ch : arr) {
			if(map.containsKey(ch)) {
			map.put(ch,map.get(ch)+1);
			
				
			}else
			{
				map.put(ch,1);
			}
		}
		System.out.println(map);
        
	}

}
