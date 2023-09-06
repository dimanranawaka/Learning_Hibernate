package lk.ijse.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private static SessionFactory sessionFactory;
    private FactoryConfiguration(){
        sessionFactory = new Configuration().buildSessionFactory();
    }
    public static FactoryConfiguration getInstance(){
        return ((factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration():factoryConfiguration);
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
}
