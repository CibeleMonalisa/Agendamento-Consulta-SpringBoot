package com.appointment.appointment.dto;

import com.appointment.appointment.entity.Doctor;
import com.appointment.appointment.entity.Patient;

import java.io.Serializable;
import java.util.Objects;

public class MedicalReportDto implements Serializable {
    private final Patient patient;
    private final Doctor doctor;
    private final String diagnostic;
    private final String procedurePerformed;
    private final String medicinePrescription;
    private final String examPrescription;
    private final String results;
    private final String comments;

    public MedicalReportDto(Patient patient, Doctor doctor, String diagnostic, String procedurePerformed, String medicinePrescription, String examPrescription, String results, String comments) {
        this.patient = patient;
        this.doctor = doctor;
        this.diagnostic = diagnostic;
        this.procedurePerformed = procedurePerformed;
        this.medicinePrescription = medicinePrescription;
        this.examPrescription = examPrescription;
        this.results = results;
        this.comments = comments;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public String getProcedurePerformed() {
        return procedurePerformed;
    }

    public String getMedicinePrescription() {
        return medicinePrescription;
    }

    public String getExamPrescription() {
        return examPrescription;
    }

    public String getResults() {
        return results;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalReportDto entity = (MedicalReportDto) o;
        return Objects.equals(this.patient, entity.patient) &&
                Objects.equals(this.doctor, entity.doctor) &&
                Objects.equals(this.diagnostic, entity.diagnostic) &&
                Objects.equals(this.procedurePerformed, entity.procedurePerformed) &&
                Objects.equals(this.medicinePrescription, entity.medicinePrescription) &&
                Objects.equals(this.examPrescription, entity.examPrescription) &&
                Objects.equals(this.results, entity.results) &&
                Objects.equals(this.comments, entity.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient, doctor, diagnostic, procedurePerformed, medicinePrescription, examPrescription, results, comments);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "patient = " + patient + ", " +
                "doctor = " + doctor + ", " +
                "diagnostic = " + diagnostic + ", " +
                "procedurePerformed = " + procedurePerformed + ", " +
                "medicinePrescription = " + medicinePrescription + ", " +
                "examPrescription = " + examPrescription + ", " +
                "results = " + results + ", " +
                "comments = " + comments + ")";
    }
}