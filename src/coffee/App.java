package coffee;

public class App {
	public static void main(String[] args) {
		// �մ�
		Customer customer = new Customer();
		// �ٸ���Ÿ
		Barista barista = new Barista();
		// �޴�
		Menu menu = Menu.getInstance();
		
		// order ����
		customer.order("���Ƹ޸�ī��", menu, barista);
	}
}
