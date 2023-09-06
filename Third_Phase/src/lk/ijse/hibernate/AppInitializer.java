package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Laptop;
import lk.ijse.hibernate.entity.Student;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {





        Student s1 = new Student();
        s1.setsId("S001");
        s1.setName("Diman");

        Laptop l2 = new Laptop();
        l2.setlId("L002");
        l2.setDescription("Asus");
        l2.setStudent(s1);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();



//        session.save(s1);
        session.save(l2);

        transaction.commit();

        session.close();
    }
}
