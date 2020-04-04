package collect;

import java.util.HashMap;

public class CollectionEx03 {

	public static void main(String[] args) {
		HashMap<String, String> h = 
				new HashMap<String, String>();
		
		h.put("password", "1234");
		
		System.out.println(h.get("password"));
	}

}
