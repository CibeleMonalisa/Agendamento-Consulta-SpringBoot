package com.appointment.appointment.Repository;

import com.appointment.appointment.entity.Expertise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertiseRepository extends JpaRepository<Expertise, Long> {
}