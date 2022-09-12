package com.appointment.appointment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Patient extends Person{

    @OneToMany //relacionamento um para muitos entre paciente para consulta (um paciente pode marcar várias consultas)
    private List<Appointment> appointments;

    public Patient(){} //construtor vazio

  public Patient(Long idPerson, String name, String cpf, String email, String telephone, Date birthDate, String address, String gender, List<Appointment> appointments) {
        super(idPerson, name, cpf, email, telephone, birthDate, address, gender);
        this.appointments = appointments;
    }
}
