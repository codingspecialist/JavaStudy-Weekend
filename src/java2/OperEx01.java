package java2;

public class OperEx01 {

	public static void main(String[] args) {
		int n1 = 40;
		int n2 = 20;
		
		System.out.println("더하기 : "+(n1+n2));
		System.out.println("빼기 : "+(n1-n2));
		System.out.println("곱하기 : "+(n1*n2));
		System.out.println("나누기 : "+(n1/n2));
		
		double bank = 0;
		
		double money = 10000;
		double m1 = money/3;
		double m2 = money/3;
		double m3 = money/3;
		System.out.println((int)m1);
		System.out.println((int)m2);
		System.out.println((int)m3);
		
		bank = money - (int)m1 - (int)m2 - (int)m3;
		System.out.println(bank);
	}

}
