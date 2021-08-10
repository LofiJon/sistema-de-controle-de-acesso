package com.dio.acessPoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empresa {

    private Long id;

    private String descricao;

    private String cnpj;

    private String endereco;

    private String cidade;

    private String estado;
}
