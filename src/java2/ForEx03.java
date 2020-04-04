package java2;

import java.util.Scanner;

public class ForEx03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.println("받은 값 : "+n1);
		
		// 8번	
		for (int i = n1; i < 9; i++) {
			// 9번
			for (int k = 1; k <= 9; k++) {
				System.out.println(i+"*"+k+"="+(i*k));
			}
		}
	}
}
