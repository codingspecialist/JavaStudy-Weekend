package coffee;

import java.util.ArrayList;
import java.util.List;

// 책임 : 메뉴 선택
public class Menu {
	
	// 싱글톤 패턴 : 객체를 한개만 만드는 방법
	private static Menu instance = new Menu();
	private List<MenuItem> items;
	
	public static Menu getInstance() {
		return instance;
	}
	
	private Menu() {
		items = new ArrayList<MenuItem>();
		items.add(new MenuItem("아메리카노", 1500));
		items.add(new MenuItem("카페라떼", 2000));
		items.add(new MenuItem("카페모카", 3000));
		items.add(new MenuItem("녹차라떼", 4000));
	}
	
	public MenuItem choose(String menuName) {
		for (MenuItem menuItem : items) {
			if(menuItem.getName().equals(menuName)) {
				return menuItem;
			}
		}
		
		return null;
	}
	
}
