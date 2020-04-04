package java1;

public class VarEx01 {
	
	public static void main(String[] args) {
		int num = 10; // num -> 380009232번지
		System.out.println(num);
		num = 50;
		System.out.println(num);
		
		// 변수의 선언
		int phone; //4byte = 32bit
		// System.out.println(phone); 초기화 되지 않아서 오류
		
		// 변수의 초기화
		phone = 102222;
		System.out.println(phone);
		
		// 타입 변수명 = 값;
		byte smallNum = 100; //1byte = 8bit
		System.out.println(smallNum);
		
		double doubleNum = 10.5; //8byte = 64bit
		System.out.println(doubleNum);
		
		int testNum1 = 100;
		double testNum2 = 10.5;
		testNum2 = testNum1; //묵시적 형변환
		System.out.println(testNum2);
		
		int testNum3 = 100;
		double testNum4 = 10.5;
		testNum3 = (int)testNum4; // 명시적 형변환(강제)
		System.out.println(testNum3);
		
		// boolean -> 0, 1 -> false, true
		boolean check = true;
		System.out.println(check);
		System.out.println(1==1);
		
		int dataNum = 20;
	
	}
}


