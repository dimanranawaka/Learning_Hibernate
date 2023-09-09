package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.Owner;
import lk.ijse.hibernate.entity.Pet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;
    private FactoryConfiguration(){


        sessionFactory = new Configuration().mergeProperties(Utility.getProperties()).addAnnotatedClass(Owner.class).addAnnotatedClass(Pet.class)
                .buildSessionFactory();

    }
    public static FactoryConfiguration getInstance(){
        return ((factoryConfiguration == null)? factoryConfiguration = new FactoryConfiguration():factoryConfiguration);
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
