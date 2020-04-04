package java1;

public class VarEx03 {

	public static void main(String[] args) {
		char ch = '가';
		System.out.println(ch);

		char[] name = {'박', '보', '검'};
		System.out.println(name);
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		// System.out.println(name[3]); //배열의 크기를 벗어남.
		
		String addr = "부산진구 중앙대로 708번지 파이낸스 건물";
		System.out.println(addr);
	}

}
