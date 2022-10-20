package System;

public class Buyer extends Person {

	private  String Username;
	private  String Password;

	public Buyer() {
		super(null);
	}

	public  Buyer(String Username, String Password)
	{
		super(null);
		this.Username = Username;
		this.Password = Password;
	}

	@Override
	public void showMenu() {
		System.out.println("Menu For Buyer Will Be Printed Here");

	}
	@Override
	public ProductMenu createProductMenu() {
		System.out.println("");
		return null;
	}

	public String getUsername() {
		return this.Username;
	}

	public  String getPassword() {
		return this.Password;
	}

}
