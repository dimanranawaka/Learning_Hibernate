package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {

        Lecturer l1 = new Lecturer();

        l1.setLecName("Niroth");
        l1.setLecId("LOO1");
        ArrayList<Subject> subjectList = null;
        l1.setSubjectList(subjectList);

        Lecturer l2 = new Lecturer();
        l2.setLecId("LOO2");
        l2.setLecName("Prasad");
        l2.setSubjectList(subjectList);


        Subject s1 = new Subject();
        s1.setSubId("S001");
        s1.setSubjectName("Java");
        ArrayList<Lecturer> lecturerList = null;
        s1.setLecturerList(lecturerList);

        Subject s2 = new Subject();
        s2.setSubId("S002");
        s2.setSubjectName("Networking");
        s2.setLecturerList(lecturerList);

        // 1 methodology
        subjectList = new ArrayList<>();
        subjectList.add(s1);
        subjectList.add(s2);

        lecturerList = new ArrayList<>();
        lecturerList.add(l1);
        lecturerList.add(l2);


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(l1);
        session.save(l2);
        session.save(s1);
        session.save(s2);

        transaction.commit();

        session.close();
    }
}
