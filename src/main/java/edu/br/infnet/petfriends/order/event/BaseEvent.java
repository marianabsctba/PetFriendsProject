package edu.br.infnet.petfriends.order.event;


public abstract class BaseEvent<T> {
    private T id;

    protected BaseEvent(T id) {
        this.id = id;
    }

    // Getter
    public T getId() {
        return id;
    }

    // Setter
    public void setId(T id) {
        this.id = id;
    }
}
