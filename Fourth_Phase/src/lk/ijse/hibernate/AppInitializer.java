package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Owner;
import lk.ijse.hibernate.entity.Pet;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        /*Owner o1 = new Owner();

        o1.setOwnerId("M001");
        o1.setOwnerName("Diman");
        o1.setPetList(o1.getPetList());

        Pet p1 = new Pet();

        p1.setPId("P001");
        p1.setBreed("Dog");
        p1.setOwnerId("M001");

        Pet p2 = new Pet();

        p2.setPId("P002");
        p2.setBreed("Cat");
        p2.setOwnerId("MOO1");

        session.save(o1);
        session.save(p1);
        session.save(p2);*/

        /*String hql = "FROM Owner";

        Query query = session.createQuery(hql);

        List<Owner> list = query.list();

        for (Owner owner: list
             ) {
            System.out.println(owner.getOwnerId()+" : "+owner.getOwnerName()+" : "+owner.getPetList());
        }*/

        String hql = "FROM Pet";

        Query query = session.createQuery(hql);

        List<Pet> listPet = query.list();

        for (Pet pet:
             listPet) {

            System.out.println(pet.getOwnerId()+" : "+pet.getBreed()+" : "+pet.getOwnerId());

        }

        transaction.commit();

        session.close();

    }
}
