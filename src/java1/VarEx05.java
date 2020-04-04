package java1;

class Car {
	String name;
	int price;
	String color;
	int power;
}

public class VarEx05 {
	public static void main(String[] args) {
		Car morning = new Car();
		morning.name = "¸ð´×";
		morning.price = 900;
		morning.color = "³ë¶û";
		morning.power = 1500;
		
		System.out.println(morning.name);
		System.out.println(morning.price);
		System.out.println(morning.color);
		System.out.println(morning.power);
	}
}
