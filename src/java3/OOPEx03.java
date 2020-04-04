package java3;

public class OOPEx03 {

	static void output(int num) {
		System.out.println(num);
	}
	
	static void output(int num, String data) {
		System.out.println(num+", "+data);
	}
	
	static void output(String s) {
		System.out.println(s);
	}
	
	static void output(double d) {
		System.out.println(d);
	}
	
	// 20°³~~~
	
	public static void main(String[] args) {
		
		output(10);
		output("¾È³ç");
		output(5.5);
		output(100, "Á¡¼ö");
	}

}
