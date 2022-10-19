package System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Facade {

	Map<String, String> buyer = new HashMap();
	Map<String, String> seller = new HashMap();

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public int login() throws IOException{

		buyer.put("tutu", "1111");
		buyer.put("mimi", "2222");
		buyer.put("nana", "3333");
		seller.put("pepe", "3333");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Username: ");
		String userName = br.readLine();

		if(buyer.containsKey(userName)) {
			System.out.print("Password: ");
			String password = br.readLine();
			UserInfoItem user = new UserInfoItem(userName, password);
			if(buyer.get(user.userName).equals(user.password)) {
				System.out.println(user.userName + " Succefully Logged In as Buyer!");
				return 0;
			}
			else {
				System.out.println("Invalid User. Please try again");
				return -1;
			}
		} else if(seller.containsKey(userName)) {
			System.out.print("Password: ");
			String password = br.readLine();
			UserInfoItem user = new UserInfoItem(userName, password);
			if(seller.get(user.userName).equals(user.password)) {
				System.out.println(user.userName + " Succefully Logged In as Seller!");
				return 1;
			} else {
				System.out.println("Invalid User. Please try again!");
				return -1;
			}
		}
		System.out.println("Invalid User. Please try again");
		return -1;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	/**
	 *  
	 */
	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
