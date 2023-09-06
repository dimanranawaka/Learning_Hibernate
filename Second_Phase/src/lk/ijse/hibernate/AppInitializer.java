package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.Name;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

        Name name = new Name();

        name.setfName("Diman");
        name.setsName("Dreed");
        name.setlName("Ranawaka");


        Customer c1 = new Customer();

        c1.setId("C001");
        c1.setName(name);
        c1.setAddress("Matara");
        c1.setSalary(5000.00);


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();


        session.save(c1);





        // Get method

//        Item i1 = session.get(Item.class, "I001");

//        System.out.println(i1);

        // Delete method
//        Item i2 = session.get(Item.class, "I001");
//
//        session.delete(i2);

        transaction.commit();

        session.close();
    }
}
