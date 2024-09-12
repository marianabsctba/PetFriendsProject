package edu.br.infnet.petfriends.order.repository;

import edu.br.infnet.petfriends.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {}
