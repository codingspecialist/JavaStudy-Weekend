package java1;

// 추상적인 것
class People {
	String name;
	int age;
	char gender;
	int height;
	int weight;
}

public class VarEx04 {
	public static void main(String[] args) {
		System.out.println("-----1985-------");
		People jooho = new People();
		jooho.name = "최주호";
		jooho.age = 35;
		jooho.gender = '남';
		jooho.height = 185;
		jooho.weight = 70;
		
		System.out.println(jooho.name);
		System.out.println(jooho.age);
		System.out.println(jooho.gender);
		System.out.println(jooho.height);
		System.out.println(jooho.weight);
	}
}
