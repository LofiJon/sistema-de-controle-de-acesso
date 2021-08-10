package com.dio.acessPoint.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ocorrencia {

    private Long id;

    private String nome;

    private String descricao;
}
