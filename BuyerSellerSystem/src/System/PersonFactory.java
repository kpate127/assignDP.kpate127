package System;

public class PersonFactory {

    public Person fetchMenu(String userType){

        if(userType == null){
            return null;
        }
        if(userType.equalsIgnoreCase("Buyers")){
            return new Buyer("Vivek", "1111");

        }
        else if(userType.equalsIgnoreCase("Sellers")){
            return new Seller("Bhrugu", "2222");
        }
        return null;
    }
}

// File -> Handler (List B, List S) -> Facade (handler) -> handler.B