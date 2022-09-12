package com.appointment.appointment.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Patient extends Person {

    @OneToMany //relacionamento um para muitos entre paciente para consulta (um paciente pode marcar várias consultas)
    private List<Appointment> appointmentList;

    @OneToMany
    private List<MedicalReport> medicalReportList;

    public Patient() {} //construtor vazio

    public Patient(Long idPerson, String name, String cpf, String email, String telephone, Date birthDate, String address, String gender, List<Appointment> appointmentList, List<MedicalReport> medicalReportList) {
        super(idPerson, name, cpf, email, telephone, birthDate, address, gender);
        this.appointmentList = appointmentList;
        this.medicalReportList = medicalReportList;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public List<MedicalReport> getMedicalReportList() {
        return medicalReportList;
    }

    public void setMedicalReportList(List<MedicalReport> medicalReportList) {
        this.medicalReportList = medicalReportList;
    }
}
