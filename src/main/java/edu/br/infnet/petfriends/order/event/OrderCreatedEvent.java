package edu.br.infnet.petfriends.order.event;

import edu.br.infnet.petfriends.grooming.model.GroomingAppointment;

public class OrderCreatedEvent extends BaseEvent<String> {
    private String description;
    private double value;
    private GroomingAppointment groomingAppointment;

    public OrderCreatedEvent(String id, String description, double value, GroomingAppointment groomingAppointment) {
        super(id);
        this.description = description;
        this.value = value;
        this.groomingAppointment = groomingAppointment;
    }

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

    public GroomingAppointment getGroomingAppointment() {
        return groomingAppointment;
    }

    public void setGroomingAppointment(GroomingAppointment groomingAppointment) {
        this.groomingAppointment = groomingAppointment;
    }
}
