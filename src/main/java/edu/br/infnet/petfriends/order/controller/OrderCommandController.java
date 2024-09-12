package edu.br.infnet.petfriends.order.controller;

import edu.br.infnet.petfriends.order.command.CreateOrderCommand;
import edu.br.infnet.petfriends.order.model.CreateOrderRequest;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
public class OrderCommandController {

    private final CommandGateway commandGateway;

    public OrderCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public ResponseEntity<String> createOrder(
            @RequestBody CreateOrderRequest request
    ) {
        String orderId = UUID.randomUUID().toString();

         CreateOrderCommand command = new CreateOrderCommand(
                orderId,
                request.getDescription(),
                request.getValue(),
                request.getProducts(),
                request.getGroomingAppointment()
        );

        commandGateway.sendAndWait(command);

        return new ResponseEntity<>(orderId, HttpStatus.CREATED);
    }
}
