package System;

public class PersonFactory {

    public static Person fetchPerson(String userType){

        if(userType == null){
            return null;
        }
        if(userType.equalsIgnoreCase("BUYERS")){
            return new Buyer("tutu", "1111");

        }
        else if(userType.equalsIgnoreCase("SELLERS")){
            return new Seller("Bhrugu", "2222");
        }
        return null;
    }
}

