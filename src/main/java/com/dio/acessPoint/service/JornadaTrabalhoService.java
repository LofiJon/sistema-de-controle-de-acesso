package com.dio.acessPoint.service;

import com.dio.acessPoint.model.JornadaTrabalho;
import com.dio.acessPoint.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaTrabalhoService {

    @Autowired
    private JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho ) {
        jornadaTrabalhoRepository.save(jornadaTrabalho);
    }
}
