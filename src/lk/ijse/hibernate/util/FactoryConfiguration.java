package lk.ijse.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {

     // 1. Create a private static property with name of class
     private static FactoryConfiguration factoryConfiguration;

     /** 1. Create a private property of SessionFactory */
     private SessionFactory sessionFactory;

     // 2. Create a private constructor
     private FactoryConfiguration(){

         /* 2. Create a configuration object  */
          Configuration configuration = new Configuration().configure();

         /* 3. Build a SessionFactory using  created object and assign it to sessionFactory property*/
          sessionFactory = configuration.buildSessionFactory();

     }

     // 3. create a public method to return an instance of the class
     public static FactoryConfiguration getInstance(){
          return ( (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration()
                  : factoryConfiguration );
     }

     /** 4. Create a public method to return session */
     public Session getSession(){

          return sessionFactory.openSession();

     }

}
