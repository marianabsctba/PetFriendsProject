package edu.br.infnet.petfriends.grooming.model;

import lombok.Getter;

@Getter
public enum GroomingServiceType {

    BATH("Banho"),
    HAIRCUT("Tosa"),
    NAIL_TRIMMING("Corte de Unhas"),
    EAR_CLEANING("Limpeza de Ouvido"),
    FULL_GROOMING("Banho e Tosa Completa");


    private final String serviceName;

    GroomingServiceType(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return serviceName;
    }
}
