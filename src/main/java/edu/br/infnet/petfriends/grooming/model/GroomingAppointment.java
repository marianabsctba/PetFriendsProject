package edu.br.infnet.petfriends.grooming.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class GroomingAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String appointmentDate;

    private String serviceType;

    private String clientId;

    public GroomingAppointment() {}

    public GroomingAppointment(String appointmentDate, String serviceType, String clientId) {
        this.appointmentDate = appointmentDate;
        this.serviceType = serviceType;
        this.clientId = clientId;
    }

}
