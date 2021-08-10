package com.dio.acessPoint.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {

    private Long id;

    private CategoriaUsuario categoriaUsuario;

    private String nome;

    private Empresa empresa;

    private NivelAcesso nivelAcesso;

    private JornadaTrabalho jornadaTrabalho;

    private BigDecimal tolerancia;

    private LocalDateTime inicioJornada;

    private LocalDateTime fimJornada;
}
