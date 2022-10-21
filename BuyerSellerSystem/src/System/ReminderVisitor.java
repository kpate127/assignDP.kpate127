package System;

public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList[] classProductList;

	public void visitProduct(Product product) {

	}

	public void visitTrading(Trading trading) {

	}

	public void visitFacade(Facade facade) {

		// Visitor Pattern
//		for (String product: ClassProductList.produceProducts) {
//			System.out.println(product);
//		}
//		for (String product: ClassProductList.meatProducts) {
//			System.out.println(product);
		for (String product: FileHandler.produceProducts) {
			System.out.println(product);
		}
		for (String product: FileHandler.meatProducts) {
			System.out.println(product);
		}

	}

}
