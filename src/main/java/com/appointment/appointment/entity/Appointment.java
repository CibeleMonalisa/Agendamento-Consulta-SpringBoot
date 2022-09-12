package com.appointment.appointment.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAppointment;
    @DateTimeFormat(pattern = "dd-mm-yyyy") //formatar a data de acordo com o formato BR
    private Date date;
    @DateTimeFormat(pattern = "00:00") //formatar hora
    private String startTime;
    @DateTimeFormat(pattern = "00:00") //formatar hora
    private String endTime;
    private String problemDescription; //descrição do motivo da consulta
    private String comments; //observações adicionais
    @ManyToOne //relacionamento muitos para um entre consulta para paciente (um paciente pode marcar várias consultas)
    private Patient patient;
    @ManyToOne //relacionamento muitos para um entre consulta para médico (um médico pode marcar várias consultas)
    private Doctor doctor;

    public Appointment() { //construtor vazio

    }

    public Appointment(Long idAppointment, Date date, String startTime, String endTime, String problemDescription, String comments, Patient patient, Doctor doctor) {
        this.idAppointment = idAppointment;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.problemDescription = problemDescription;
        this.comments = comments;
        this.patient = patient;
        this.doctor = doctor;
    }

    public Long getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Long idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
