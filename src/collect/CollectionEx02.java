package collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionEx02 {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("사과");
		arr.add("딸기");
		arr.add("바나나");
		
		// 사과, 복숭아, 바나나
		arr.set(1, "복숭아");
		
		// 사과, 배, 복숭아, 바나나
		arr.add(1, "배");
		
		for (String s : arr) {
			System.out.println(s);
		}
		
		arr.clear();
		System.out.println(arr.size());

		
	}

}
