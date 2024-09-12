package edu.br.infnet.petfriends.order.command;

import edu.br.infnet.petfriends.grooming.model.GroomingAppointment;
import edu.br.infnet.petfriends.product.model.Product;

import java.util.List;

public class CreateOrderCommand extends BaseCommand<String> {
    private String description;
    private double value;
    private List<Product> products;
    private GroomingAppointment groomingAppointment;

    public CreateOrderCommand(String id, String description, double value, List<Product> products, GroomingAppointment groomingAppointment) {
        super(id);
        this.description = description;
        this.value = value;
        this.products = products;
        this.groomingAppointment = groomingAppointment;
    }

    // Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public GroomingAppointment getGroomingAppointment() {
        return groomingAppointment;
    }

    public void setGroomingAppointment(GroomingAppointment groomingAppointment) {
        this.groomingAppointment = groomingAppointment;
    }
}
