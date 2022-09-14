package com.appointment.appointment.dto;

import com.appointment.appointment.entity.Appointment;
import com.appointment.appointment.entity.MedicalReport;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PatientDto implements Serializable {
    private final String name;
    private final String cpf;
    private final String email;
    private final String telephone;
    private final Date birthDate;
    private final String address;
    private final String gender;
    private final List<Appointment> appointmentList;
    private final List<MedicalReport> medicalReportList;

    public PatientDto(String name, String cpf, String email, String telephone, Date birthDate, String address, String gender, List<Appointment> appointmentList, List<MedicalReport> medicalReportList) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.telephone = telephone;
        this.birthDate = birthDate;
        this.address = address;
        this.gender = gender;
        this.appointmentList = appointmentList;
        this.medicalReportList = medicalReportList;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public List<MedicalReport> getMedicalReportList() {
        return medicalReportList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientDto entity = (PatientDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.cpf, entity.cpf) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.telephone, entity.telephone) &&
                Objects.equals(this.birthDate, entity.birthDate) &&
                Objects.equals(this.address, entity.address) &&
                Objects.equals(this.gender, entity.gender) &&
                Objects.equals(this.appointmentList, entity.appointmentList) &&
                Objects.equals(this.medicalReportList, entity.medicalReportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, email, telephone, birthDate, address, gender, appointmentList, medicalReportList);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "cpf = " + cpf + ", " +
                "email = " + email + ", " +
                "telephone = " + telephone + ", " +
                "birthDate = " + birthDate + ", " +
                "address = " + address + ", " +
                "gender = " + gender + ", " +
                "appointmentList = " + appointmentList + ", " +
                "medicalReportList = " + medicalReportList + ")";
    }
}