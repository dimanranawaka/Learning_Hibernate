package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "pet")
public class Pet {
    @Id
    private String pId;
    private String breed;

    public Pet() {
    }

    public Pet(String pId, String breed) {
        this.pId = pId;
        this.breed = breed;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pId='" + pId + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
