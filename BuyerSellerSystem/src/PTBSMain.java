import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Handler;

import System.Facade;
import System.Buyer;
import System.Seller;
import System.*;
public class PTBSMain {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        ClassProductList classProductList = new ClassProductList();
        ClassProductList productList = new ClassProductList();
        ProductMenuFactory productMenuFactory = new ProductMenuFactory();

//      Facade Pattern is implemented here

        FileHandler handler = new FileHandler();
        handler.addBuyerDetails("BuyerSellerSystem/resources/BuyerInfo.txt");
        handler.addSellerDetails("BuyerSellerSystem/resources/SellerInfo.txt");
        handler.fetchProductMenu("BuyerSellerSystem/resources/ProductInfo.txt");
        handler.showBuyers();
        handler.showSeller();
        Facade facade = new Facade(handler);
        int userType = facade.login();
        while(userType == -1) {
            userType = facade.login();
        }


//        Factory Design Pattern is implemented here

        if (userType == 0) {
            Buyer buyer = new Buyer();
            System.out.println("Select 0 for Produce OR 1 for Meat");
            String foodType = scan.nextLine();

            if(foodType.equals("0"))
            {
                Person p = PersonFactory.fetchPerson("BUYERS");
                p.setTheProductMenu(new ProduceProductMenu());
                p.showMenu();
            }
            else if(foodType.equals("1"))
            {
                Person p = PersonFactory.fetchPerson("BUYERS");
                p.setTheProductMenu(new MeatProductMenu());
                p.showMenu();
            }

        } else if (userType == 1) {
            Seller seller = new Seller();
            System.out.println("Select 0 for Produce OR 1 for Meat");
            String foodType = scan.nextLine();

            if(foodType.equals("0"))
            {
                Person p = PersonFactory.fetchPerson("BUYERS");
                p.setTheProductMenu(new ProduceProductMenu());
                p.showMenu();
            }
            else if(foodType.equals("1"))
            {
                Person p = PersonFactory.fetchPerson("BUYERS");
                p.setTheProductMenu(new MeatProductMenu());
                p.showMenu();
            }
        }


        System.out.println("\n<<<<<<<<<--------------------------------------->>>>>>>>>>>\n");

//      Bridge Design Pattern is implemented here

        productList.fetchAllProductMenu("BuyerSellerSystem/resources/ProductInfo.txt");
        productList.showAllProductMenu();


        System.out.println("\n************************************************************\n");

//      Iterator Design pattern is implemented here

        for (ListIterator litr = classProductList.getListIterator(); litr.hasNext(); ) {
            Product product = (Product) litr.next();
            System.out.println("Product Type :" + product.fetchType()+ "    Product Name : " + product.fetchName());
        }

        System.out.println("\n************************************************************\n");

        ProductMenu productMenu1 = productMenuFactory.fetchMenu("PRODUCE");
        productMenu1.showMenu();
        for(int i=0; i<ClassProductList.produceProducts.size();i++)
            System.out.println(ClassProductList.produceProducts.get(i));


        ProductMenu productMenu2 = productMenuFactory.fetchMenu("MEAT");
        productMenu2.showMenu();
        for(int i=0; i<ClassProductList.meatProducts.size();i++)
            System.out.println(ClassProductList.meatProducts.get(i));


//        ClassProductList pL;
//        System.ClassProductList.ProductIterator = new System.ClassProductList.ProductIterator(fileHandling.productList);
//
//        while(productIterator.hasNext()){
//            Product pro = productIterator.Next();
//            System.out.println(pro.getProductType()+"");
//        }


//        Visitor Design Pattern is implemented here
        System.out.println("\n************************************************************\n");

        ReminderVisitor visitor = new ReminderVisitor();
        visitor.visitFacade(new Facade(new FileHandler()));


    }
}