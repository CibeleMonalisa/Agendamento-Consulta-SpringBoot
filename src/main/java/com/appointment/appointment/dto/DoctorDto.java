package com.appointment.appointment.dto;

import com.appointment.appointment.entity.Appointment;
import com.appointment.appointment.entity.Expertise;
import com.appointment.appointment.entity.MedicalReport;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DoctorDto implements Serializable {
    private final String name;
    private final String cpf;
    private final String email;
    private final String telephone;
    private final Date birthDate;
    private final String address;
    private final String gender;
    private final Long crm;
    private final String crmLocation;
    private final List<Appointment> appointments;
    private final List<Expertise> expertiseList;
    private final List<MedicalReport> medicalReportList;

    public DoctorDto(String name, String cpf, String email, String telephone, Date birthDate, String address, String gender, Long crm, String crmLocation, List<Appointment> appointments, List<Expertise> expertiseList, List<MedicalReport> medicalReportList) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.telephone = telephone;
        this.birthDate = birthDate;
        this.address = address;
        this.gender = gender;
        this.crm = crm;
        this.crmLocation = crmLocation;
        this.appointments = appointments;
        this.expertiseList = expertiseList;
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

    public Long getCrm() {
        return crm;
    }

    public String getCrmLocation() {
        return crmLocation;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public List<Expertise> getExpertiseList() {
        return expertiseList;
    }

    public List<MedicalReport> getMedicalReportList() {
        return medicalReportList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorDto entity = (DoctorDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.cpf, entity.cpf) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.telephone, entity.telephone) &&
                Objects.equals(this.birthDate, entity.birthDate) &&
                Objects.equals(this.address, entity.address) &&
                Objects.equals(this.gender, entity.gender) &&
                Objects.equals(this.crm, entity.crm) &&
                Objects.equals(this.crmLocation, entity.crmLocation) &&
                Objects.equals(this.appointments, entity.appointments) &&
                Objects.equals(this.expertiseList, entity.expertiseList) &&
                Objects.equals(this.medicalReportList, entity.medicalReportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, email, telephone, birthDate, address, gender, crm, crmLocation, appointments, expertiseList, medicalReportList);
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
                "crm = " + crm + ", " +
                "crmLocation = " + crmLocation + ", " +
                "appointments = " + appointments + ", " +
                "expertiseList = " + expertiseList + ", " +
                "medicalReportList = " + medicalReportList + ")";
    }
}