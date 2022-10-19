package System;

public class Product {

	private  String name;
	private  String type;

	public Product(String name, String type){
		this.name = name;
		this.type = type;
	}

	public String fetchName() {
		return name;
	}

	public String fetchType() {
		return type;
	}
}
