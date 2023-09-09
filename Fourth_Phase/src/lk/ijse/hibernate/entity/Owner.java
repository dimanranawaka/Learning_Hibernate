package lk.ijse.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Owner {
   @Id
   private String ownerId;

   private String ownerName;
   @OneToMany(mappedBy = "ownerId")
   private List<Pet> petList = new ArrayList<>();
}
