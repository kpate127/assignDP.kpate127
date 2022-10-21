package System;

import java.util.ArrayList;

public class ProduceProductMenu implements ProductMenu {

	//ArrayList<String> produceProducts = new ArrayList<>();
	public void showMenu() {

		System.out.println("-------------------Produce Product Menu---------------------");

		for(int i=0; i<FileHandler.produceProducts.size();i++)
			System.out.println(FileHandler.produceProducts.get(i));
	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
