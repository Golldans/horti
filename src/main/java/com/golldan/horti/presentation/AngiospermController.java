package com.golldan.horti.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/angiosperm")
public class AngiospermController {

    @GetMapping("/listall")
    public String listAllAngiosperm() {
        return "Hello world";
    }
}
