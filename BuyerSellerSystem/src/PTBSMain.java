import java.io.IOException;
import System.Facade;
import System.Buyer;
import System.Seller;
import System.*;
public class PTBSMain {
    public static void main(String[] args) throws IOException {

//        System.out.println("------------- MENU -----------------");
//
//        System.out.println("Press 1 for adding Buyer");
//        System.out.println("Press 2 for adding Seller");
//        System.out.println("Press 3 to View All Buyer ");
//        System.out.println("Press 4 to View All Seller");
//        System.out.println("Press 5 to Add Meat Product");
//        System.out.println("Press 6 to Add Produce Product");
//        System.out.println("Press 7 to View All Meat Product");
//        System.out.println("Press 8 To View All Produce Product");
//        System.out.println("Press 0 To Exit");

//        Facade facade = new Facade();
//        int userType = facade.login();
//        while(userType == -1) {
//            userType = facade.login();
//        }
//
//        if (userType == 0) {
//            Buyer buyer = new Buyer();
//            buyer.showMenu();
//            buyer.createProductMenu();
//            buyer.showMenu();
//        } else if (userType == 1) {
//            Seller seller = new Seller();
//            seller.showMenu();
//            seller.createProductMenu();
//            seller.showMenu();
//        }

        ProductMenuFactory productMenuFactory = new ProductMenuFactory();
        ProductMenu productMenu1 = productMenuFactory.fetchMenu("PRODUCE");
        productMenu1.showMenu();

        ProductMenu productMenu2 = productMenuFactory.fetchMenu("MEAT");
        productMenu2.showMenu();

        PersonFactory personFactory = new PersonFactory();
        Person person1 = personFactory.fetchMenu("Buyers");
        Person person2 = personFactory.fetchMenu("Sellers");
        person1.showMenu();
        person2.showMenu();

        System.out.println("Bridge Pattern is implemented here");

        Person buyer = new Buyer("Vivek", "1111");
        Person seller = new Seller("Bhrugu", "2222");

        buyer.showMenu();
        seller.showMenu();

        System.out.println("Iterator Method is implemented here");

        ClassProductList classProductList = new ClassProductList();

        for (ListIterator litr = classProductList.getListIterator(); litr.hasNext(); ) {
            Product product = (Product) litr.next();
            System.out.println("Product Name : " + product.fetchName()+ "   Product Type :" + product.fetchType());
        }


        System.out.println("Iterator Method finishes");
    }
}