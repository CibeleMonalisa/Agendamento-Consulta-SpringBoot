package com.appointment.appointment.service;

import com.appointment.appointment.Repository.DoctorRepository;
import com.appointment.appointment.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface DoctorService {

//POST
Doctor save(Doctor doctor);

//DELETE BY ID
void delete(Doctor productDto);

// SELECT BY ID
Optional<Doctor> findById(Long id);

// SELECT ALL
    Page<Doctor> list(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable);

}
