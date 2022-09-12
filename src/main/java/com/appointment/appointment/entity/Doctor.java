package com.appointment.appointment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Doctor extends Person {
    private Long crm;
    private String crmLocation;
    @OneToMany //relacionamento um para muitos entre médico para consulta (um médico pode ter várias consultas)
    private List<Appointment> appointments;
    @ManyToMany //relacionamento muitos para muitos entre especialidade e médico (vários médicos para várias especialidades)
    @JsonIgnore
    @JoinTable(
            name = "ExpertiseDoctor",
            uniqueConstraints = @UniqueConstraint(columnNames = {"idPerson", "idExpertise"}),
            joinColumns = @JoinColumn(name = "idPerson"),
            inverseJoinColumns = @JoinColumn(name = "idExpertise")
    )
    private List<Expertise> expertise;


    public Doctor() {} //construtor vazio

    public Doctor(Long idPerson, String name, String cpf, String email, String telephone, Date birthDate, String address, String gender, Long crm, String crmLocation, List<Appointment> appointments, List<Expertise> expertise) {
        super(idPerson, name, cpf, email, telephone, birthDate, address, gender); //construtor da classe mãe (Person)
        this.crm = crm;
        this.crmLocation = crmLocation;
        this.appointments = appointments;
        this.expertise = expertise;
    }
}

