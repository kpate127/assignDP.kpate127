package System;
import java.sql.SQLOutput;
import java.util.*;
public class MeatProductMenu implements ProductMenu {

	public void showMenu() {

		System.out.println("---------------------Meat Product Menu----------------------");
		for(int i=0; i<FileHandler.meatProducts.size();i++)
			System.out.println(FileHandler.meatProducts.get(i));
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
