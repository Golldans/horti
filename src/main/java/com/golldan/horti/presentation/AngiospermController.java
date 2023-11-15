package com.golldan.horti.presentation;

import com.golldan.horti.infra.entities.AngiospermEntity;
import com.golldan.horti.infra.repositories.AngiospermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/angiosperm")
public class AngiospermController {

    private final AngiospermRepository employeeRepository;

    public AngiospermController(AngiospermRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/list_all")
    public Iterable<AngiospermEntity> listAllAngiosperm() {
        return this.employeeRepository.findAll();
    }
}
