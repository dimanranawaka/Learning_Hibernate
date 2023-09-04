package lk.ijse.hibernate.util;

public class FactoryConfiguration {

     // Create a private static property with name of class
     private static FactoryConfiguration factoryConfiguration;

     // Create a private constructor
     private FactoryConfiguration(){
     }

     // create a public method to return an instance of the class
     public static FactoryConfiguration getInstance(){
          return ( (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration()
                  : factoryConfiguration );
     }

}
