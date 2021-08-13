package com.dio.acessPoint.controller;

import com.dio.acessPoint.model.JornadaTrabalho;
import com.dio.acessPoint.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.saveJornada(jornadaTrabalho);
    }


    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.getById(id).orElseThrow(()-> new NoSuchElementException("Jornada nao encontrada")));
    }


}
