package java2;

public class OperEx04 {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		
		// 비교 연산자는 boolean을 리턴한다.
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(!(a==b));
		System.out.println(a<=b);
		
		// 논리 연산자는 조건이 2개 이상일 때 사용
		System.out.println((a==b) || (a<b));
		System.out.println(false || true);
		System.out.println(false && true);
	}

}





