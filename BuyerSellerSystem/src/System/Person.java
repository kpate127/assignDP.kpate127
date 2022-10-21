package System;

import java.io.IOException;

public abstract class Person {

	ProductMenu theProductMenu;

	public Person(ProductMenu theProductMenu)
	{
		this.theProductMenu = theProductMenu;
	}

	public abstract void showMenu();

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public abstract ProductMenu createProductMenu();

	public void setTheProductMenu(ProductMenu theProductMenu) {
		this.theProductMenu = theProductMenu;
	}
}
