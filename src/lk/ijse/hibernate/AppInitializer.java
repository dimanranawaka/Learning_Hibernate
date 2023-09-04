package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

        Customer c1 = new Customer();


        c1.setId("C001");
        c1.setName("Diman");
        c1.setSalary(50000.00);
        c1.setAddress("Matara");

        Customer C2 = new Customer();


        C2.setId("C002");
        C2.setName("Diman");
        C2.setSalary(50000.00);
        C2.setAddress("Matara");


        // Opening a session
        Session session = FactoryConfiguration.getInstance().getSession();
        //Setting Transaction
//        Transaction transaction = session.beginTransaction();

//        session.update(C2);

        // For getting customer

        /* session.get(<className>,<Identifier>) */

        session.get(Customer.class,"C001");

        System.out.println(session.get(Customer.class,"C001"));

        // Adding data to the tables
//        transaction.commit();
        // Closing the session
        session.close();
    }
}
