package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;

public class AppInitializer {
    public static void main(String[] args) {

        Customer c1 = new Customer();

        c1.setId("C001");
        c1.setName("Diman");
        c1.setSalary(50000.00);
        c1.setAddress("Matara");

        // Opening a session
        Session session = FactoryConfiguration.getInstance().getSession();

        session.save(c1);

        // Closing the session
        session.close();
    }
}
