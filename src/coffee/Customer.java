package coffee;

// å�� : �ֹ� = ��� ����
// �޽��� : �޴� ����
public class Customer {
	
	public void order(String menuName, Menu menu, Barista barista) {
		// �޴� ���� (�Լ� ȣ�� : �޽���)
		MenuItem menuItem = menu.choose(menuName);
		if(menuItem == null) {
			System.out.println("���� �޴��Դϴ�.");
			return;
		}
		// Ŀ�� ����� (�Լ� ȣ�� : �޽���)
		Coffee coffee =barista.makeCoffee(menuItem);
		
		System.out.println("Ŀ�� ���Խ��ϴ�.");
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
	}
}
