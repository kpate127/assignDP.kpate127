package System;
import java.io.*;
import java.util.Scanner;

public class Seller extends Person {

	ClassProductList productList = new ClassProductList();

	private  String Username;
	private  String Password;

	public Seller() {
		super(null);
	}

	public  Seller(String Username, String Password)
	{
		super(null);
		this.Username = Username;
		this.Password = Password;
	}

	public void showMenu(){

		theProductMenu.showMenu();


	}

	public ProductMenu createProductMenu(){

		return null;
	}

	public String getUsername() {
		return this.Username;
	}

	public  String getPassword() {
		return this.Password;
	}



}
