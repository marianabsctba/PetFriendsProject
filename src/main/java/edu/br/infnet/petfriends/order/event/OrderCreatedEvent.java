package edu.br.infnet.petfriends.order.event;

import edu.br.infnet.petfriends.grooming.model.GroomingAppointment;
import lombok.Getter;

@Getter
public class OrderCreatedEvent extends BaseEvent<String> {
    private final String description;
    private final double value;
    private final GroomingAppointment groomingAppointment;

    public OrderCreatedEvent(String id, String description, double value, GroomingAppointment groomingAppointment) {
        super(id);
        this.description = description;
        this.value = value;
        this.groomingAppointment = groomingAppointment;
    }

}
