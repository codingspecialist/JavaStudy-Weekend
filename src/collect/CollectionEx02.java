package collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionEx02 {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("���");
		arr.add("����");
		arr.add("�ٳ���");
		
		// ���, ������, �ٳ���
		arr.set(1, "������");
		
		// ���, ��, ������, �ٳ���
		arr.add(1, "��");
		
		for (String s : arr) {
			System.out.println(s);
		}
		
		arr.clear();
		System.out.println(arr.size());

		
	}

}
