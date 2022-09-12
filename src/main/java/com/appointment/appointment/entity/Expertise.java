package com.appointment.appointment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Expertise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExpertise;
    private String nome;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name="ExpertiseDoctor",
            uniqueConstraints = @UniqueConstraint(columnNames = {"idPerson", "idExpertise"}),
            joinColumns = @JoinColumn(name = "idExpertise"),
            inverseJoinColumns = @JoinColumn(name = "idPerson")
    )
    private List<Doctor> doctors;

    public Expertise() {
    }

    public Expertise(Long idExpertise, String nome, List<Doctor> doctors) {
        this.idExpertise = idExpertise;
        this.nome = nome;
        this.doctors = doctors;
    }

    public Long getIdExpertise() {
        return idExpertise;
    }

    public void setIdExpertise(Long idExpertise) {
        this.idExpertise = idExpertise;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
}
