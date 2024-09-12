package edu.br.infnet.petfriends.order.service;

import edu.br.infnet.petfriends.order.model.Order;
import edu.br.infnet.petfriends.order.repository.OrderRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderQueryService {
    private final EventStore eventStore;

    @Autowired
    private OrderRepository orderRepository;

    public OrderQueryService(EventStore eventStore) {
        this.eventStore = eventStore;
    }

    public List<Object> listEvents(String orderId) {
        return eventStore.readEvents(orderId).asStream().collect(Collectors.toList());
    }

    public Optional<Order> getOrderById(String id) {
        return orderRepository.findById(id);
    }
}
