package com.appointment.appointment.dto;

import com.appointment.appointment.entity.Doctor;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ExpertiseDto implements Serializable {
    private final String nome;
    private final List<Doctor> doctors;

    public ExpertiseDto(String nome, List<Doctor> doctors) {
        this.nome = nome;
        this.doctors = doctors;
    }

    public String getNome() {
        return nome;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpertiseDto entity = (ExpertiseDto) o;
        return Objects.equals(this.nome, entity.nome) &&
                Objects.equals(this.doctors, entity.doctors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, doctors);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nome = " + nome + ", " +
                "doctors = " + doctors + ")";
    }
}