package coffee;

public class App {
	public static void main(String[] args) {
		// 손님
		Customer customer = new Customer();
		// 바리스타
		Barista barista = new Barista();
		// 메뉴
		Menu menu = Menu.getInstance();
		
		// order 실행
		customer.order("블랙아메리카노", menu, barista);
	}
}
