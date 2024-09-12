package edu.br.infnet.petfriends.order.aggregate;

import edu.br.infnet.petfriends.order.command.CreateOrderCommand;
import edu.br.infnet.petfriends.order.event.OrderCreatedEvent;
import edu.br.infnet.petfriends.grooming.model.GroomingAppointment;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
public class OrderAggregate {

    @AggregateIdentifier
    private String id;
    private String description;
    private double value;
    private GroomingAppointment groomingAppointment;

    public OrderAggregate() {
    }

    @CommandHandler
    public OrderAggregate(CreateOrderCommand command) {
        apply(new OrderCreatedEvent(
                command.getId(),
                command.getDescription(),
                command.getValue(),
                command.getGroomingAppointment()
        ));
    }

    @EventSourcingHandler
    public void on(OrderCreatedEvent event) {
        this.id = event.getId();
        this.description = event.getDescription();
        this.value = event.getValue();
        this.groomingAppointment = event.getGroomingAppointment();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
