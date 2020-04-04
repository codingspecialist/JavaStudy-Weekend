package java2;

public class ArrayEx01 {
	
	static void print1(int n1) {
		n1 = n1 + 1;
		System.out.println("print1 stack n1 : "+n1);
	}
	
	static void print2(int[] num) {
		num[2] = 100;
		System.out.println("print2 stack num[2] : "+ num[2]);
	}
	
	public static void main(String[] args) {
		// num -> 주소 -> 실제값 (레퍼런스변수)
		int[] num = new int[3];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);

		int n1 = 50;
		print1(n1);
		System.out.println("main stack n1 : "+n1);
		
		print2(num);
		System.out.println("main stack num[2] : "+ num[2]);
	}
}
