package com.appointment.appointment.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MedicalReport {
    @Id
    @DateTimeFormat(pattern="dd-mm-yyyy 00:00:00.000")
    private String data;

    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    private String diagnostic;
    private String procedurePerformed;
    private String medicinePrescription;
    private String examPrescription;
    private String results;
    private String comments;

    public MedicalReport(String data, Patient patient, Doctor doctor, String diagnostic, String procedurePerformed, String medicinePrescription, String examPrescription, String results, String comments) {
        this.data = data;
        this.patient = patient;
        this.doctor = doctor;
        this.diagnostic = diagnostic;
        this.procedurePerformed = procedurePerformed;
        this.medicinePrescription = medicinePrescription;
        this.examPrescription = examPrescription;
        this.results = results;
        this.comments = comments;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getProcedurePerformed() {
        return procedurePerformed;
    }

    public void setProcedurePerformed(String procedurePerformed) {
        this.procedurePerformed = procedurePerformed;
    }

    public String getMedicinePrescription() {
        return medicinePrescription;
    }

    public void setMedicinePrescription(String medicinePrescription) {
        this.medicinePrescription = medicinePrescription;
    }

    public String getExamPrescription() {
        return examPrescription;
    }

    public void setExamPrescription(String examPrescription) {
        this.examPrescription = examPrescription;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
