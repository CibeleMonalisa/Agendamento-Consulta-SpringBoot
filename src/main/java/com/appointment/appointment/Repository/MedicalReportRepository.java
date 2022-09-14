package com.appointment.appointment.Repository;

import com.appointment.appointment.entity.MedicalReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalReportRepository extends JpaRepository<MedicalReport, String> {
}