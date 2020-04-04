package java2;

public class ForEx05 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++) {
			// 1부터 100까지의 수 중에 4의 배수를 출력하시오.
			if(i%4==0) {
				System.out.println(i);
			}
		}
		
		int sum = 0;
		
		for (int i = 1; i < 100; i++) {
			// 1부터 100까지의 수 중에 4의 배수의 합을 출력하시오.
			if(i%4==0) {
				sum = sum+i;
			}
		}
		
		System.out.println("합은 : "+sum);
		
		// 1부터 10까지의 합을 출력하시오.
		int result = 0;
		for (int i = 1; i < 10000; i++) {
			result = result +i;
		}
		System.out.println("합은 : "+result);
	}
	
}
