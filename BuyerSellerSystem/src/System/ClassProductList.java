package System;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassProductList extends ArrayList {

	public Product names[] = {new Product("Meat","Ham"), new Product("Meat","Turkey"),
			new Product("Produce","Ginger"), new Product("Produce","Tomato") };

	Map<String, String> pMenu;
	public ClassProductList() {
		this.pMenu = new HashMap<>();
	}
	public void fetchProductMenu(String path) {
		try {
			File myObj = new File(path);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] pInfo = data.split(":");
				pMenu.put(pInfo[1], pInfo[0]);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error Occurred");
			System.out.println(e);
		}
	}

	public void fetchMenu() {
		for(String itr: pMenu.keySet()) {
			System.out.println(itr + " " + pMenu.get(itr));
		}
	}


	public void accept(NodeVisitor visitor){

	}

	public ListIterator getListIterator()
	{
		return new ProductIterator();
	}

	public class ProductIterator implements ListIterator{

		int pos;

		public  boolean hasNext(){

			if(pos < names.length){
				return true;
			}
			return false;
		}
		public  Product next(){

			if(this.hasNext()){
				return names[pos++];
			}
			return null;
		}
		public  void MoveToHead(){

		}
		public  void Remove(){

		}

        /*public String getProductName()
        {
            return names[pos].getProductName();
        }

        public String getProductType()
        {
            return names[pos].getProductType();
   */
}


	private ReminderVisitor reminderVisitor;

	private Product product;

	private ProductIterator productIterator;


}
