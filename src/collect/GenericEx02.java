package collect;

// int => Integer
// long => Long
// double => Double

class Data<H, T> {
	H value;
	T val;
}

public class GenericEx02 {

	public static void main(String[] args) {
		Data<String, String> d = new Data();
		d.value = "문자열";
		
		Data<Integer, String> d2 = new Data();
		d2.value = 1234;
		d2.val = "문자열";
	}

}
