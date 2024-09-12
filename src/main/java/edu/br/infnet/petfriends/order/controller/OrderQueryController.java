package edu.br.infnet.petfriends.order.controller;

import edu.br.infnet.petfriends.order.exception.OrderNotFoundException;
import edu.br.infnet.petfriends.order.model.Order;
import edu.br.infnet.petfriends.order.service.OrderQueryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderQueryController {

    private final OrderQueryService orderQueryService;

    public OrderQueryController(OrderQueryService orderQueryService) {
        this.orderQueryService = orderQueryService;
    }

    @GetMapping("/{id}/events")
    public List<Object> listEvents(@PathVariable String id) {
        return orderQueryService.listEvents(id);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id) {
        return orderQueryService.getOrderById(id).orElseThrow(() -> new OrderNotFoundException(id));
    }
}
