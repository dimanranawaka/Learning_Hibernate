package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Laptop;
import lk.ijse.hibernate.entity.Owner;
import lk.ijse.hibernate.entity.Pet;
import lk.ijse.hibernate.entity.Student;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {

        Owner o1 = new Owner();

        o1.setoId("M001");
        o1.setName("Diman");


        Pet p1 = new Pet();

        p1.setpId("P001");
        p1.setBreed("Dog");
        p1.setOwner(o1);

        Pet p2 = new Pet();

        p2.setpId("P002");
        p2.setBreed("Dog");
        p2.setOwner(o1);

        // Creating a petList to hold the all that own by one owner
        List<Pet> petList = new ArrayList<>();

        petList.add(p1);
        petList.add(p2);

        o1.setPetList(petList);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(o1);

        session.save(p1);
        session.save(p2);


        transaction.commit();

        session.close();
    }
}
