package java2;

/**
 * 
 * @author 주호
 *  for 반복할 때!! (키워드) 
 *	 for(int i=0; i<10; i++){
 *
 *
 * }
 * 1. 초기값 설정 int i=0;     -> i는 0
 * 2. 조건을 비교 i<10;          -> true
 * 3. 스택이 실행 (true)      -> 스택 실행
 * 
 * 4. 증감식 i = i + 1             -> i는 1
 * 5. 조건을 비교 i<10            -> true
 * 6. 스택이 실행 (true)       -> 스택 실행
 * 
 * 7. 증감식 i = i + 1              -> i는 2
 * 8. 조건을 비교 i<10            -> true
 * 9. 스택이 실행 (true)       -> 스택 실행
 */

public class ForEx01 {

	static void hello(int i) {
		System.out.println(i+".안녕하세요!!");
	}
	
	public static void main(String[] args) {
		for (int i = 3; i <= 100; i=i+3) {
			hello(i);
		}		
	}
}






