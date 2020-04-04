package java2;

/**
 * 
 * @author 주호
 *                if(조건문){
 *                
 *                }
 *
 */

public class ForEx04 {

	public static void main(String[] args) {
		
		int n1 = 100;
		
		if(n1 >99) {
			System.out.println("참입니다.");
		}
		
		for (int i = 1; i <= 100; i++) {
			
			if(i%3==1) {
				System.out.println("3으로 나누면 나머지가 1인 친구들 : "+i);
			}else {
				System.out.println(i);
			}
				
		}

	}

}
