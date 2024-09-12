package edu.br.infnet.petfriends.order.controller;

import edu.br.infnet.petfriends.order.command.CreateOrderCommand;
import edu.br.infnet.petfriends.order.model.CreateOrderRequest;
import edu.br.infnet.petfriends.order.service.OrderCommandService;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
public class OrderCommandController {

    private final CommandGateway commandGateway;
    private final OrderCommandService orderCommandService;

    public OrderCommandController(CommandGateway commandGateway, OrderCommandService orderCommandService) {
        this.commandGateway = commandGateway;
        this.orderCommandService = orderCommandService;
    }

    @PostMapping
    public ResponseEntity<String> createOrder(
            @RequestBody CreateOrderRequest request
    ) {
        String orderId = UUID.randomUUID().toString();

        orderCommandService.createOrder(
                orderId,
                request.getDescription(),
                request.getValue(),
                request.getProducts(),
                request.getGroomingAppointment()
        );

        return new ResponseEntity<>(orderId, HttpStatus.CREATED);
    }
}
