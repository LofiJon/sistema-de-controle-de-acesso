package com.dio.acessPoint.service;

import com.dio.acessPoint.model.JornadaTrabalho;
import com.dio.acessPoint.repository.JornadaTrabalhoRepository;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    @Autowired
    private JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho ) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long id) {
        return jornadaTrabalhoRepository.findById(id);
    }

    public ResponseEntity updateJornada(Long id,JornadaTrabalho jornadaTrabalho ) {
        return jornadaTrabalhoRepository.findById(id)
                .map(record -> {
                    record.setDescricao((jornadaTrabalho.getDescricao()));
                    JornadaTrabalho update = jornadaTrabalhoRepository.save(jornadaTrabalho);
                    return ResponseEntity.ok().body(update);
                }).orElse(ResponseEntity.notFound().build());
    }

    public void delete(Long id) {
        jornadaTrabalhoRepository.deleteById(id);
    }

}
