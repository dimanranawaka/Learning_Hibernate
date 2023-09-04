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

        Customer c2 = new Customer();

        c2.setId("C002");
        c2.setName("Dasun");
        c2.setSalary(60000.00);
        c2.setAddress("Akuresa");

        Customer c3 = new Customer();

        c3.setId("C003");
        c3.setName("Ranawaka");
        c3.setSalary(60000.00);
        c3.setAddress("Maliduwa");

        Customer c4 = new Customer();

        c4.setId("C004");
        c4.setName("Dreed");
        c4.setSalary(60000.00);
        c4.setAddress("Akuresa");

        // Opening a session
        Session session = FactoryConfiguration.getInstance().getSession();

        //Setting Transaction
        Transaction transaction = session.beginTransaction();

        session.save(c4);

        // Adding data to the tables
        transaction.commit();
        // Closing the session
        session.close();
    }
}
