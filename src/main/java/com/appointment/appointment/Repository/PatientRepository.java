package com.appointment.appointment.Repository;

import com.appointment.appointment.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository  extends JpaRepository<Doctor, Long> {
}
