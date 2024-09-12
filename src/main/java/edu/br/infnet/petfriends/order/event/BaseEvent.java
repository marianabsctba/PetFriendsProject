package edu.br.infnet.petfriends.order.event;

import lombok.Getter;

@Getter
public abstract class BaseEvent<T> {
    private final T id;

    protected BaseEvent(T id) {
        this.id = id;
    }

}
