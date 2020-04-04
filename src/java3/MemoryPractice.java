package java3;

public class MemoryPractice {

	int num = 10;
	static int sNum = 20;
	
	void play() {
		int localPlayNum = 100;
		System.out.println(localPlayNum);
	}
	
	static void speak() {
		int localSpeakNum = 200;
		System.out.println(localSpeakNum);
	}
	
	public static void main(String[] args) {
		MemoryPractice mp = new MemoryPractice();
		MemoryPractice.speak();
		mp.play();
		System.out.println("¾È³ç!!");
		System.out.println("¾È³ç!!");
		System.out.println("¾È³ç!!");
		System.out.println("¾È³ç!!");
	}

}
