package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {
    @Id
    String ownerId;
    String ownerName;
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    List<Pet> petList = new ArrayList<>();
    public Owner() {
    }

    public Owner(String ownerId, String ownerName, List<Pet> petList) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.petList = petList;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownerId='" + ownerId + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", petList=" + petList +
                '}';
    }
}
