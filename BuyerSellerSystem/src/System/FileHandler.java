package System;

import java.util.*;
import java.io.*;

public class FileHandler {

    public static java.util.ArrayList<String> meatProducts = new java.util.ArrayList<>();
    public static java.util.ArrayList<String> produceProducts = new java.util.ArrayList<>();

    Map<String, String> buyer;
    Map<String, String> seller;
    Map<String, String> pMenu;

    public FileHandler() {
        this.buyer = new HashMap<>();
        this.seller = new HashMap<>();
    }

    public void addBuyerDetails(String path) {
       try {
           File myObj = new File(path);
           Scanner myReader = new Scanner(myObj);
           while (myReader.hasNextLine()) {
               String data = myReader.nextLine();
               String[] userDetails = data.split(":");
               buyer.put(userDetails[0], userDetails[1]);
           }
           myReader.close();
       } catch (FileNotFoundException e) {
           System.out.println("Error Occurred");
           System.out.println(e);
       }
    }

    public void addSellerDetails(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] userDetails = data.split(":");
                seller.put(userDetails[0], userDetails[1]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Occurred");
        }
    }

    public void showBuyers() {
        for(String itr: buyer.keySet()) {
            System.out.println(itr + " " + buyer.get(itr));
        }
    }

    public void showSeller() {
        for(String itr: seller.keySet()) {
            System.out.println(itr + " " + seller.get(itr));
        }
    }

    public void fetchProductMenu(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] pInfo = data.split(":");

                if(pInfo[0].equals("Meat")) {

                    meatProducts.add(pInfo[1]);
                }
                else if(pInfo[0].equals("Produce")) {

                    produceProducts.add(pInfo[1]);
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Occurred");
            System.out.println(e);
        }
    }
    public void showfetchMenu() {
        for(String itr: pMenu.keySet()) {
            System.out.println(itr + " : " + pMenu.get(itr));
        }
    }


}
