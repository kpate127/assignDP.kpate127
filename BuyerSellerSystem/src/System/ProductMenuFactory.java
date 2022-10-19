package System;

public class ProductMenuFactory {

    public ProductMenu fetchMenu(String typeOfProduct){

        if(typeOfProduct == null){
            return null;
        }
        if(typeOfProduct.equalsIgnoreCase("MEAT")){
            return new MeatProductMenu();

        }
        else if(typeOfProduct.equalsIgnoreCase("PRODUCE")){
            return new ProduceProductMenu();
        }
        return null;
    }
}
