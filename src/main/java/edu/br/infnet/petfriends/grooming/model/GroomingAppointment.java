package edu.br.infnet.petfriends.grooming.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class GroomingAppointment {

    @Id
    private String id;
    private String petName;

    @Enumerated(EnumType.STRING)
    private GroomingServiceType serviceType;

    public GroomingAppointment() {}

    public GroomingAppointment(String id, String petName, GroomingServiceType serviceType) {
        this.id = id;
        this.petName = petName;
        this.serviceType = serviceType;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public GroomingServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(GroomingServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
