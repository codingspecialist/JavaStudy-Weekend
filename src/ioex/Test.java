package ioex;

class ������ {}
class �ѱ��� extends ������{}
class ��ҿ� extends �ѱ���{}

public class Test {
	public static void main(String[] args) {
		������ s = new �ѱ���(); // �ѱ���, ������
		try {
			��ҿ� d = (��ҿ�)s;
		} catch (Exception e) {
			System.out.println("��ҿ����� ĳ������ �� �����.");
		}
		
		
	}

}
