package com.dio.acessPoint.controller;

import com.dio.acessPoint.model.JornadaTrabalho;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @PostMapping
    public JornadaTrabalho createJornada() {
        return null;
    }
}
