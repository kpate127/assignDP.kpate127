import java.io.IOException;
import java.util.logging.Handler;

import System.Facade;
import System.Buyer;
import System.Seller;
import System.*;
public class PTBSMain {
    public static void main(String[] args) throws IOException {

        ClassProductList classProductList = new ClassProductList();

        System.out.println("Facade Pattern is implemented here");

        FileHandler handler = new FileHandler();
        handler.addBuyerDetails("BuyerSellerSystem/resources/BuyerInfo.txt");
        handler.addSellerDetails("BuyerSellerSystem/resources/SellerInfo.txt");
        handler.showBuyers();
        handler.showSeller();
        Facade facade = new Facade(handler);
        int userType = facade.login();
        while(userType == -1) {
            userType = facade.login();
        }

        if (userType == 0) {
            Buyer buyer = new Buyer();
            buyer.showMenu();
            buyer.createProductMenu();
        } else if (userType == 1) {
            Seller seller = new Seller();
            seller.showMenu();
            seller.createProductMenu();
        }


        System.out.println("<<<<<<<<<<--------------------------------------->>>>>>>>>>>");
//      Factory Pattern is implemented here

        ProductMenuFactory productMenuFactory = new ProductMenuFactory();
        ProductMenu productMenu1 = productMenuFactory.fetchMenu("PRODUCE");
        productMenu1.showMenu();
        for(int i=0; i<ClassProductList.produceProducts.size();i++)
            System.out.println(ClassProductList.produceProducts.get(i));


        ProductMenu productMenu2 = productMenuFactory.fetchMenu("MEAT");
        productMenu2.showMenu();
        for(int i=0; i<ClassProductList.meatProducts.size();i++)
            System.out.println(ClassProductList.meatProducts.get(i));


//        PersonFactory personFactory = new PersonFactory();
//        Person person1 = personFactory.fetchMenu("Buyers");
//        person1.showMenu();
//        Person person2 = personFactory.fetchMenu("Sellers");
//        person2.showMenu();

        System.out.println("*********************************************");
//      Bridge Pattern is implemented here

        ClassProductList productList = new ClassProductList();
        productList.fetchProductMenu("BuyerSellerSystem/resources/ProductInfo.txt");
        productList.showfetchMenu();


        System.out.println("**********************************************");
//      Iterator Method is implemented here


        for (ListIterator litr = classProductList.getListIterator(); litr.hasNext(); ) {
            Product product = (Product) litr.next();
            System.out.println("Product Type :" + product.fetchType()+ "    Product Name : " + product.fetchName());
        }

        System.out.println("**********************************************");



    }
}