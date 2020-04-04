package java3;

// 클래스 = 설계도
// 상태 (변수)
// 행위 (메서드)
// 생성자 (Constructor)
class Person {
	private String name;
	private int age;
	private String mind;
	private int height;
	private int weight;

	// 없어도 존재함. = 생략 가능함.
	public Person(String name1, int age1, int height1, int weight1) {		
		name = name1;
		age = age1;
		height = height1;
		weight = weight1;
	}
	
	public void setName(String name1) {
		name = name1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age1) {
		age = age1;
	}
	
	public int getAge() {
		return age;
	}

	// 프로이드 : 인간의 성격은 5세이하에 결정된다.
	public void setMind(String mind1) {
		if(age < 6) {
			mind = mind1;	
		}else {
			System.out.println("넌 성격 못바꿔!!");
		}	
	}
	
	public String getMind() {
		return mind;
	}
	
	public void setHeight(int height1) {
		height = height1;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWeight(int weight1) {
		weight = weight1;
	}
	
	public int getWeight() {
		return weight;
	}
}

public class OOPEx01 {

	public static void main(String[] args) {
		Person 최주호 = new Person("최주호", 1, 50, 4);
		System.out.println(최주호.getName());
		System.out.println(최주호.getAge());
		System.out.println(최주호.getHeight());
		System.out.println(최주호.getWeight());
		
		// 5년이 흘렀음.
		최주호.setAge(5);
		최주호.setMind("소심");
		
		System.out.println("5년 경과~~~~~~~~~");
		System.out.println(최주호.getAge());
		System.out.println(최주호.getMind());
		
		System.out.println("7년 경과~~~~~~~~~");
		최주호.setAge(7);
		System.out.println(최주호.getAge());
	}

}
