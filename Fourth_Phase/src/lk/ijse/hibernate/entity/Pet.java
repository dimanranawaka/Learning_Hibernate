package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
    @Id
    String petId;
    String petName;
    @ManyToOne
    Owner owner;

    public Pet() {
    }

    public Pet(String petId, String petName, Owner owner) {
        this.petId = petId;
        this.petName = petName;
        this.owner = owner;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
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
                "petId='" + petId + '\'' +
                ", petName='" + petName + '\'' +
                ", owner=" + owner +
                '}';
    }
}
