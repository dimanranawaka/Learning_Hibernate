package lk.ijse.hibernate.util;

import java.util.Properties;

public class Utility {
    public static Properties getProperties(){

        Properties properties = new Properties();

        try{

            properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));

        }catch (Exception e){

            e.printStackTrace();
        }
        return properties;
    }
}
