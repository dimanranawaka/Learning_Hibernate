package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity(name = "pet")
public class Pet {
    @Id
    private String pId;
    private String breed;

    @ManyToOne // When Considering pet table : Many pets may have one owner
    private Owner owner;

    public Pet() {
    }

    public Pet(String pId, String breed, Owner owner) {
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pId='" + pId + '\'' +
                ", breed='" + breed + '\'' +
                ", owner=" + owner +
                '}';
    }
}
