package coffee;

// 책임 : 주문 = 묶어서 관리
// 메시지 : 메뉴 선택
public class Customer {
	
	public void order(String menuName, Menu menu, Barista barista) {
		// 메뉴 선택 (함수 호출 : 메시지)
		MenuItem menuItem = menu.choose(menuName);
		if(menuItem == null) {
			System.out.println("없는 메뉴입니다.");
			return;
		}
		// 커피 만들기 (함수 호출 : 메시지)
		Coffee coffee =barista.makeCoffee(menuItem);
		
		System.out.println("커피 나왔습니다.");
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
	}
}
