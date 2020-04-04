package java2;

public class OperEx02 {
	
	// void -> 인출하지 않는다.
	static double send(double money) {
		return money%3;
	}
	
	public static void main(String[] args) {
		double result = OperEx02.send(10000);
		System.out.println(result);
		
		double result2 = OperEx02.send(9000);
		System.out.println(result2);
		
		double result3 = OperEx02.send(5000);
		System.out.println(result3);
		
		System.out.println("검증 : "+(5000%3));
	}

}
