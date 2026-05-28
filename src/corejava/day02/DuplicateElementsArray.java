package corejava.day02;

import java.util.HashMap;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		int[] nums = {1,2,2,4,5,1,4,5,6,3};
		int count = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i : nums) {
			if(map.containsKey(i)) {
			map.put(i, map.get(i)+1);
			
		}else {
			map.put(i, 1);
		}
			
		}
for(int key:map.keySet()) {
	if(map.get(key)>1) {
		System.out.println("Duplicate element is" + key);
	}
}
	}

}
