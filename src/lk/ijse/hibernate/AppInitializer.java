package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;

public class AppInitializer {
    public static void main(String[] args) {

        Customer c1 = new Customer();

        c1.setId("C001");
        c1.setName("Diman");
        c1.setSalary(50000.00);
        c1.setAddress("Matara");


    }
}
