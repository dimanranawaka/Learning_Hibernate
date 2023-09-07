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

        /*String hql = "FROM Owner";
        Query query = session.createQuery(hql);
        List<Owner> ownerList = query.list();

        for (Owner owner:
                ownerList) {
            System.out.println(owner.getOwnerId() + " : "+owner.getOwnerName() + " : "+ owner.getPetList());
        }*/

        // SELECT specified Column

        /*String hql ="SELECT name FROM Owner";

        Query query = session.createQuery(hql);

        List<String> list = query.list(); // returns String List

        for (String stringList:list
             ) {
            System.out.println(list);
        }*/

        // Where Clause

       /* String hql = "FROM Owner WHERE name LIKE 'D%' ";
        Query query = session.createQuery(hql);

        List<Owner> list = query.list();

        for (Owner owner:
            list ) {
            System.out.println(list);
        }*/

        // ORDER BY clause

        /*String hql = "FROM Owner o ORDER BY o.ownerId DESC";
        Query query = session.createQuery(hql);
        List<Owner> listOwner = query.list();

        for (Owner owner:
             listOwner) {
            System.out.println(listOwner);
        }*/

        // Using name parameters
        // perform WHERE Clause

        /*String name = "Diman";

        String hql = "FROM Owner WHERE name = : owner_name";

        Query query = session.createQuery(hql);

        query.setParameter("owner_name",name);

        List<Owner> listOwner = query.list();

        for (Owner owner:
             listOwner) {
            System.out.println(listOwner);
        }*/

        // Update Clause

        String id = "M001";
        String name = "Diman";

        String hql = "UPDATE Owner SET name = : owner_name WHERE ownerId = :owner_id ";

        Query query = session.createQuery(hql);

        query.setParameter("owner_name",name);
        query.setParameter("owner_id",id);

        int rowCount = query.executeUpdate();

        System.out.println(rowCount > 0 ? "Updated ": "Not");

        transaction.commit();
        session.close();
    }
}
