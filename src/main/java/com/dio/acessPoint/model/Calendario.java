package com.dio.acessPoint.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Calendario {
    private Long id;

    private  TipoData tipoData;

    private  String descricao;

    private LocalDateTime dataEspecial;
}
