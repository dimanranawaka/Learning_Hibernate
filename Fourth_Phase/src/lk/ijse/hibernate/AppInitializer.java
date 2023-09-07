package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Owner;
import lk.ijse.hibernate.entity.Pet;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /*Owner owner1 = new Owner();

        owner1.setOwnerId("M001");
        owner1.setOwnerName("Diman");

        Pet pet1 = new Pet();

        pet1.setPetId("P001");
        pet1.setPetName("Dog");
        pet1.setOwner(owner1);

        Pet pet2 = new Pet();

        pet2.setPetId("P002");
        pet2.setPetName("Cat");
        pet2.setOwner(owner1);

        owner1.getPetList().add(pet1);
        owner1.getPetList().add(pet2);*/

        // Lazy Fetching
//        Owner m001 = session.get(Owner.class, "M001");

        // --- In HQL ---

        String hql = "FROM Owner";
        Query query = session.createQuery(hql);
        List<Owner> ownerList = query.list();

        for (Owner owner:
                ownerList) {
            System.out.println(owner.getOwnerId() + " : "+owner.getOwnerName() + " : "+ owner.getPetList());
        }

        transaction.commit();
        session.close();
    }
}
