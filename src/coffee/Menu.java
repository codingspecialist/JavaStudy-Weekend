package coffee;

import java.util.ArrayList;
import java.util.List;

// å�� : �޴� ����
public class Menu {
	
	// �̱��� ���� : ��ü�� �Ѱ��� ����� ���
	private static Menu instance = new Menu();
	private List<MenuItem> items;
	
	public static Menu getInstance() {
		return instance;
	}
	
	private Menu() {
		items = new ArrayList<MenuItem>();
		items.add(new MenuItem("�Ƹ޸�ī��", 1500));
		items.add(new MenuItem("ī���", 2000));
		items.add(new MenuItem("ī���ī", 3000));
		items.add(new MenuItem("������", 4000));
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
