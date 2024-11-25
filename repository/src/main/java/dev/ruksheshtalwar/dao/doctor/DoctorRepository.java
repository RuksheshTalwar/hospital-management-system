package dev.ruksheshtalwar.dao.doctor;

import dev.ruksheshtalwar.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {


}
