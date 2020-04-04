package java2;

/**
 * 
 * @author 별 그리기
 * 밖에 있는 fot문은 행의 개수
 * 안에 있는 for문은 열의 개수
 */

public class StarEx01 {

	public static void main(String[] args) {
		System.out.println("   *"); // 공백 3, 별 1
		System.out.println(" ***"); // 공백 1, 별 3
		System.out.println("*****"); // 공백 0, 별 5
		System.out.println();

		for (int i = 0; i < 4; i++) {

			if (i == 3) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		System.out.println("========= 별그리기 ==========");
		for (int i = 0; i < 5; i++) {

			if (i == 3) {
				System.out.print("*");
				break; // 반복문을 빠져나가!!
			}
			
			System.out.print(" ");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			if(i==0) {
				System.out.print(" ");
			}else {
				if(i==4) break;
				System.out.print("*");	
			}
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}

	}

}
