package edu.br.infnet.petfriends.order.service;

import edu.br.infnet.petfriends.order.command.CreateOrderCommand;
import edu.br.infnet.petfriends.grooming.model.GroomingAppointment;
import edu.br.infnet.petfriends.product.model.Product;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderCommandService {
    private final CommandGateway commandGateway;

    public OrderCommandService(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    public void createOrder(String id, String description, double value, List<Product> products, GroomingAppointment groomingAppointment) {
        CreateOrderCommand command = new CreateOrderCommand(id, description, value, products, groomingAppointment);
        commandGateway.send(command);
    }
}
