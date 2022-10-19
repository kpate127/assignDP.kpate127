package System;

public class Buyer extends Person {

	private  String Username;
	private  String Password;

	public  Buyer(String Username, String Password)
	{
		super(null);
		this.Username = Username;
		this.Password = Password;
	}
	@Override
	public void showMenu() {
		System.out.println("Menu For Buyer Will Be Printer Here");

	}
	@Override
	public ProductMenu createProductMenu() {
		return null;
	}

}
