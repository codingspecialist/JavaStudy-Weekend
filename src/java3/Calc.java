package java3;

public class Calc {
	
	static int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}	
	
	static int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	// multi(곱하기), divide(나누기)
	static int multi(int n1, int n2) {
		return n1 * n2;
	}
	
	static int divide(int n1, int n2) {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		int resultAdd = add(40, 20);
		System.out.println(resultAdd);
		
		int resultMinus = minus(40, 20);
		System.out.println(resultMinus);
		
		int resultMulti = multi(40, 20);
		System.out.println(resultMulti);
		
		int resultDivide = divide(40, 20);
		System.out.println(resultDivide);
	}

}
