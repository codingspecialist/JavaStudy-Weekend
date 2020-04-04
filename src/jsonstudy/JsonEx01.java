package jsonstudy;

import com.google.gson.Gson;

class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class JsonEx01 {

	public static void main(String[] args) {
		String data = "{\"nam\":\"¸ÁÄ¡\", \"price\":3000}";
		System.out.println(data);
		
		Gson gson = new Gson();
		// fromJson() : Json => JavaObject
		Product p = gson.fromJson(data, Product.class);
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		
		// toJson() : JavaObject => Json
		Product p2 = new Product("Ä¡¾à", 1000);
		String output = gson.toJson(p2);
		System.out.println(output);
	}

}
