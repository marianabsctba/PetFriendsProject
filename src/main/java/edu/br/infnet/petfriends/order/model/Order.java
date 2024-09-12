package edu.br.infnet.petfriends.order.model;

import edu.br.infnet.petfriends.grooming.model.GroomingAppointment;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "`ORDER`")
public class Order {

    @Id
    private String id;
    private String productDescription;
    private double totalValue;

    @OneToOne(cascade = CascadeType.ALL)
    private GroomingAppointment groomingAppointment;

    public Order() {}

    public Order(String id, String productDescription, double totalValue, GroomingAppointment groomingAppointment) {
        this.id = id;
        this.productDescription = productDescription;
        this.totalValue = totalValue;
        this.groomingAppointment = groomingAppointment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", totalValue=" + totalValue +
                ", groomingAppointment=" + groomingAppointment +
                '}';
    }
}
