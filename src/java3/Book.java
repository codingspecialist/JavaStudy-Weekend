package java3;

// Book b1 = new Book();
// 설계도 (상태, 행위, 초기화)
public class Book {

	private int num; //책 번호
	private String name; //책 이름
	private int page; //책 페이지수
	private String category; //책 카테고리
	
	// Book b1 = new Book();
	public Book() {
	
	}
	
	// Book b2 = new Book("알라딘", 300);
	public Book(String name, int page) {
		this.name = name;
		this.page = page;
	}

	// Book b3 = new Book(1003, "사피엔스", 800, "과학");
	public Book(int num, String name, int page, String category) {
		this.num = num;
		this.name = name;
		this.page = page;
		this.category = category;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
