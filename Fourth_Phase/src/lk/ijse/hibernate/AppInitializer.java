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

        // --- SELECT *

        /*String hql = "FROM Owner";

        Query query = session.createQuery(hql);

        List<Owner> list = query.list();

        for (Owner owner: list
             ) {
            System.out.println(owner.getOwnerId()+" : "+owner.getOwnerName()+" : "+owner.getPetList());
        }*/

        /*String hql = "FROM Pet";

        Query query = session.createQuery(hql);

        List<Pet> listPet = query.list();

        for (Pet pet:
             listPet) {

            System.out.println(pet.getOwnerId()+" : "+pet.getBreed()+" : "+pet.getOwnerId());

        }*/

        // SELECT specific COLUMN

        /*String hql = "SELECT pId FROM Pet";

        Query query = session.createQuery(hql);

        List<String> breedList = query.list();

        for (String s:
             breedList) {
            System.out.println(s);
        }*/

        // WHERE Clause

        /*String hql = "FROM Owner WHERE ownerName LIKE 'D%'";

        Query query = session.createQuery(hql);

        List <Owner> list = query.list();

        for (Owner names:
             list) {
            System.out.println(names);
        }*/

        /*String hql = "SELECT pId , breed FROM Pet";

        Query query = session.createQuery(hql);

        List<String[]> list = query.list();

        for (String[] select:
             list) {
            System.out.println(select);
        }*/

        // ORDER BY Clause

        /*String hql = "From Owner o ORDER BY o.ownerId desc";

        Query query = session.createQuery(hql);

        List<Owner> list = query.list();

        for (Owner owner:
             list) {
            System.out.println(owner);
        }*/

        // --- Using name parameters ---

        // WHERE Clause
        /*String breed = "Dog";
        String hql = "FROM Pet WHERE breed = :breed_name";

        Query query = session.createQuery(hql);

        query.setParameter("breed_name",breed);

        List<Pet> list = query.list();

        for (Pet pet:
             list) {
            System.out.println(pet.getOwnerId()+" : "+" : "+pet.getPId()+" : "+pet.getBreed());
        }*/

        // UPDATE Clause

        String id = "P001";
        String name = "Wolf";

        String hql = "UPDATE Pet SET breed = :pet_breed WHERE pId = :owner_id";

        Query query = session.createQuery(hql);

        query.setParameter("pet_breed",name);
        query.setParameter("owner_id",id);

        int i = query.executeUpdate();

        if (i>0){
            System.out.println("Updated!");
        }else {
            System.out.println("Not Updated!");
        }

        transaction.commit();

        session.close();

    }
}
