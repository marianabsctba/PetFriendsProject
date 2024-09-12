package edu.br.infnet.petfriends.order.command;

public abstract class BaseCommand<T> {
    private T id;

    protected BaseCommand(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
