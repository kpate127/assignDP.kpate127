package System;
import java.io.*;
import java.util.Scanner;

public class Seller extends Person {

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
		System.out.println("Menu For Seller Will Be Printer Here");

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

//	MeatProductMenu meatMenu = new MeatProductMenu();
//	ProduceProductMenu produceMenu = new ProduceProductMenu();
//	public void showMenu() {
//		System.out.println("------------- MEAT MENU -------------");
//		for(String product: meatMenu.meatProducts)
//			System.out.println(product);
//		System.out.println("------------- PRODUCE MENU -------------");
//		for(String product: produceMenu.produceProducts)
//			System.out.println(product);
//	}
//
//	public ProductMenu createProductMenu() throws  IOException{
//		System.out.println("Press 1 to create meat product menu");
//		System.out.println("Press 2 to create produce product menu");
//		System.out.println("Option (1/2): ");
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int option = Integer.parseInt(br.readLine());
//
//		if(option == 1) {
//			System.out.println("List items to add in meat menu:");
//			while(true) {
//				String input = br.readLine();
//				if(input.equals("Q"))
//					break;
//				meatMenu.meatProducts.add("Meat:"+input);
//			}
//			System.out.println("Meat menu created");
//		} else if(option == 2) {
//			System.out.println("List items to add in produce menu:");
//			while(true) {
//				String input = br.readLine();
//				if(input.equals("Q"))
//					break;
//				produceMenu.produceProducts.add("Produce:"+input);
//			}
//			System.out.println("Produce menu created");
//		}
//
//		return null;
//	}

}
