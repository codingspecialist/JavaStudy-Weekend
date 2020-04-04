package coffee;

// 책임 : 커피 제조
public class Barista {
	
	public Coffee makeCoffee(MenuItem menuItem) {
		return new Coffee(menuItem);
	}
}
