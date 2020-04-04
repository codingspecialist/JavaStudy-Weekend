package java3;

/**
 * 
 * @author 오버로딩의 한계
 * 해결방안 : 다형성 (상속)
 *
 */

class Zealot{
	String name = "질럿";
	int hp = 100;
	int attack = 10;
}

class Dragoon {
	String name = "드라군";
	int hp = 100;
	int attack = 20;
}

class Hydra {
	String name = "히드라";
	int hp = 100;
	int attack = 30;
}

public class OOPEx04 {
	
	// 질럿이 드라군을 공격
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"의 체력은 "+u2.hp+"입니다.");
	}
	
	// 드라군이 질럿을 공격
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"의 체력은 "+u2.hp+"입니다.");
	}
	
	// 질럿이 질럿을 공격
	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"의 체력은 "+u2.hp+"입니다.");
	}
	
	// 히드라 -> 질럿
	static void attack(Hydra u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"의 체력은 "+u2.hp+"입니다.");
	}
	
	// 히드라 -> 드라군
	static void attack(Hydra u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"의 체력은 "+u2.hp+"입니다.");
	}
	
	// 질럿 -> 히드라
	static void attack(Zealot u1, Hydra u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"의 체력은 "+u2.hp+"입니다.");
	}
	
	// 드라군 -> 히드라
	static void attack(Dragoon u1, Hydra u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"의 체력은 "+u2.hp+"입니다.");
	}
	
	// 히드라 -> 히드라
	static void attack(Hydra u1, Hydra u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name+"의 체력은 "+u2.hp+"입니다.");
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot();
		Dragoon d1 = new Dragoon();
		
		// 질럿 -> 드라군
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		
		// 드라군 -> 질럿
		attack(d1, z1);
		
		Zealot z2 = new Zealot();
		// 질럿 1 -> 질럿 2
		attack(z1, z2);
	}
	
}



