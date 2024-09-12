package edu.br.infnet.petfriends.order.exception;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(String id) {
        super("Pedido com ID " + id + " não foi encontrado.");
    }
}