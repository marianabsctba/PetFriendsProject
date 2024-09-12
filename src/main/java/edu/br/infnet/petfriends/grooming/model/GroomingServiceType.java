package edu.br.infnet.petfriends.grooming.model;

public enum GroomingServiceType {

    BATH("Banho"),
    HAIRCUT("Tosa"),
    NAIL_TRIMMING("Corte de Unhas"),
    EAR_CLEANING("Limpeza de Ouvido"),
    FULL_GROOMING("Banho e Tosa Completa");

    private String serviceName;

    GroomingServiceType(String serviceName) {
        this.serviceName = serviceName;
    }

    // Getter
    public String getServiceName() {
        return serviceName;
    }

    // Setter
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return serviceName;
    }
}
