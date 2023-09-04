package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Item item1 = new Item();

        item1.setCode("I001");
        item1.setDescription("Cake");
        item1.setPrice(100);
        item1.setQty(500);

        session.save(item1);

        transaction.commit();

        session.close();
    }
}
