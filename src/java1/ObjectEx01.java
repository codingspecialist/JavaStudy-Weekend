package java1;

class Car1 {
	String name = "소나타";
	String color = "하얀색";
	int power = 2000;
}

public class ObjectEx01 {
	public static void main(String[] args) {
		
		int num = 10;
		double num2 = 5.5;
		char ch = '가';
		String str = "가나다";
		boolean check = true; // true, false
		Car1 car = new Car1();
		
		Object data = 5.4;
		System.out.println(data);
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(check);
		
		System.out.println(car.name);
		System.out.println(car.color);
		System.out.println(car.power);
	}
}


