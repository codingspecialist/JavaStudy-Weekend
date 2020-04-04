package collect;

class Fruits {
	
}

class Apple{
	
}

class Banana {
	
}

class 바구니<T> {
	T[] b;
}

public class GenericEx01 {

	public static void main(String[] args) {
		바구니<Apple> b = new 바구니();

		바구니<Banana> b2 = new 바구니();
	}

}
