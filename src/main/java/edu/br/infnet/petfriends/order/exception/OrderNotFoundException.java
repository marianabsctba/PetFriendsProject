package edu.br.infnet.petfriends.order.exception;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(String id) {
        super("Pedido com ID " + id + " não foi encontrado.");
    }

    public OrderNotFoundException(String id, Throwable cause) {
        super("Pedido com ID " + id + " não foi encontrado.", cause);
    }
}
