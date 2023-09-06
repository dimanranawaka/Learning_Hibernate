package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Laptop;
import lk.ijse.hibernate.entity.Student;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {







        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();





        transaction.commit();

        session.close();
    }
}
