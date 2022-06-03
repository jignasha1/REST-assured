package AmazonImplementation;

import java.util.ArrayList;

public class Product {
	
	String productName;
	int price;
	public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public ArrayList<String> getProductlist()
	{
		ArrayList<String> productList = new ArrayList<>();
		productList.add("Apple MacBook Pro");
		productList.add("Apple MacBook Air");
		productList.add("Apple iPhone 12");
		return productList;
	}
}
