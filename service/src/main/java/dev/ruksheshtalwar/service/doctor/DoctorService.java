package dev.ruksheshtalwar.service.doctor;

import dev.ruksheshtalwar.dao.doctor.DoctorRepository;
import dev.ruksheshtalwar.mailservice.EmailService;
import dev.ruksheshtalwar.model.doctor.Doctor;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Autowired
    private EmailService emailService;

    @PostConstruct
    public void initDoctor(){
        repository.saveAll(Stream.of(new Doctor(101, "John", "Cardiac"),
                        new Doctor(102, "Peter", "eye"))
                .collect(Collectors.toList()));
    }

    public List<Doctor> getDoctors(){
        emailService.sendEmail();
        return repository.findAll();
    }


}
