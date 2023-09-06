package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Laptop")
public class Laptop {
    @Id
    private String lId;
    private String description;
    @OneToOne
    private Student student;
    public Laptop() {
    }

    public Laptop(String lId, String description) {
        this.lId = lId;
        this.description = description;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lId='" + lId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
