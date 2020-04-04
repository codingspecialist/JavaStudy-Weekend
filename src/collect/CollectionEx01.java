package collect;

import java.util.ArrayList;

public class CollectionEx01 {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		//System.out.println(arr.get(2));
		arr.remove(2);
		for (Integer i : arr) {
			System.out.println(i);
		}

		// 1, 2
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == 2) {
				arr.remove(i);
			}
		}
		
		for (Integer i : arr) {
			System.out.println(i);
		}
	
		// Vector
		
		
		// HashMap
		
		
	}

}
