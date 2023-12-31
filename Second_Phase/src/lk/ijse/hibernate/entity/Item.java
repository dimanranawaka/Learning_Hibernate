package lk.ijse.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

@Entity
public class Item {
    // This is an Annotation - Annotation means : Meta-Data , Extra Information
    // @Transient- This will ignore the specific property by with creating column in database table
    // @CreationTimestamp - This will automatically fill values to the Date column
    @Id
    @Column(name = "item_code")
    String code;
    String description;
    double price;
    @Transient
    int qty;
    @CreationTimestamp
    Date date;
    public Item() {
    }

    public Item(String code, String description, double price, int qty) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.qty = qty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
