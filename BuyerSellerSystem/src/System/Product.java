package System;

public class Product {

	private  String type;
	private  String name;

	public Product(String type, String name){
		this.type = type;
		this.name = name;
	}

	public String fetchName() {
		return name;
	}

	public String fetchType() {
		return type;
	}
}
