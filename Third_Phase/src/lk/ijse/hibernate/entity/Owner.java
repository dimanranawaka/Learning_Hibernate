package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "owner")
public class Owner {
    @Id
    private String oId;
    private String name;

    public Owner() {
    }

    public Owner(String oId, String name) {
        this.oId = oId;
        this.name = name;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "oId='" + oId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
