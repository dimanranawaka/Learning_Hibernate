package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Student")
public class Student {
    @Id
    private String sId;
    private String name;
    @OneToOne(mappedBy = "student")
    private Laptop laptop;
    public Student() {
    }
    public Student(String sId, String name) {
        this.sId = sId;
        this.name = name;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

