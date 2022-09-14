package com.appointment.appointment.dto;

import com.appointment.appointment.entity.Doctor;
import com.appointment.appointment.entity.Patient;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * A DTO for the {@link com.appointment.appointment.entity.Appointment} entity
 */
public class AppointmentDto implements Serializable {
    private final Long idAppointment;
    @DateTimeFormat(pattern = "dd-mm-yyyy") //formatar a data de acordo com o formato BR
    private final String date;
    @DateTimeFormat(pattern = "00:00") //formatar hora
    private final String startTime;
    @DateTimeFormat(pattern = "00:00") //formatar hora
    private final String endTime;
    private final String problemDescription;
    private final String comments;
    private final Patient patient;
    private final Doctor doctor;

    public AppointmentDto(Long idAppointment, String date, String startTime, String endTime, String problemDescription, String comments, Patient patient, Doctor doctor) {
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

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public String getComments() {
        return comments;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppointmentDto entity = (AppointmentDto) o;
        return Objects.equals(this.idAppointment, entity.idAppointment) &&
                Objects.equals(this.date, entity.date) &&
                Objects.equals(this.startTime, entity.startTime) &&
                Objects.equals(this.endTime, entity.endTime) &&
                Objects.equals(this.problemDescription, entity.problemDescription) &&
                Objects.equals(this.comments, entity.comments) &&
                Objects.equals(this.patient, entity.patient) &&
                Objects.equals(this.doctor, entity.doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAppointment, date, startTime, endTime, problemDescription, comments, patient, doctor);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idAppointment = " + idAppointment + ", " +
                "date = " + date + ", " +
                "startTime = " + startTime + ", " +
                "endTime = " + endTime + ", " +
                "problemDescription = " + problemDescription + ", " +
                "comments = " + comments + ", " +
                "patient = " + patient + ", " +
                "doctor = " + doctor + ")";
    }
}