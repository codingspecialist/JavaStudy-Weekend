package java3;

public class OOPEx02 {

	
	static void bookPrint(Book book) {
		System.out.println("책번호 : "+book.getNum());
		System.out.println("책이름 : "+book.getName());
		System.out.println("책페이지수 : "+book.getPage());
		System.out.println("책카테고리 : "+book.getCategory());
		System.out.println("===========");
	}
	
	public static void main(String[] args) {
		Book b1 = new Book(1001, "밀레니엄", 200, "추리"); // 책 한권 생성
		Book b2 = new Book(1002, "삼국지", 500, "역사"); // 책 한권 생성
		Book b3 = new Book(1003, "사피엔스", 800, "과학"); // 책 한권 생성
		Book b4 = new Book(1004, "삼만리", 100, "아동"); // 책 한권 생성
		
		b3.setPage(900); // 책 페이지수 수정
		
		bookPrint(b1);
		bookPrint(b2);
		bookPrint(b3);
		bookPrint(b4);
	
	}

}
