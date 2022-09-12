package com.appointment.appointment.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass //mapeando superclasse
//medico e paciente são pessoas, herdarão dessa mesma classe
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPerson;
    private String name;
    private String cpf;
    private String email;
    private String telephone;
    private Date birthDate;
    private String address;

    private String gender;

    public Person() {
    }

    public Person(Long idPerson, String name, String cpf, String email, String telephone, Date birthDate, String address, String gender) {
        this.idPerson = idPerson;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.telephone = telephone;
        this.birthDate = birthDate;
        this.address = address;
        this.gender = gender;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long id) {
        this.idPerson = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
