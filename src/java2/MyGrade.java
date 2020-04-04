package java2;

import java.util.Scanner;

/**
 * 
 * @author 학점 구하기
 *
 */

public class MyGrade {
	public static void main(String[] args) {
		System.out.println("성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt(); // 프로그램 키보드 입력 대기중
		System.out.println("성적 : "+point);
		
		if(point >= 90) {
			System.out.println("A 학점입니다.");
		}else if(point >= 80){
			System.out.println("B 학점입니다.");
		}else if(point >= 70){
			System.out.println("C 학점입니다.");
		}else if(point >= 60){
			System.out.println("D 학점입니다.");
		}else {
			System.out.println("F 학점입니다.");
		}
	}
}









