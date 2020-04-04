package ioex;

class 지구인 {}
class 한국인 extends 지구인{}
class 고소영 extends 한국인{}

public class Test {
	public static void main(String[] args) {
		지구인 s = new 한국인(); // 한국인, 지구인
		try {
			고소영 d = (고소영)s;
		} catch (Exception e) {
			System.out.println("고소영으로 캐스팅할 순 없어요.");
		}
		
		
	}

}
