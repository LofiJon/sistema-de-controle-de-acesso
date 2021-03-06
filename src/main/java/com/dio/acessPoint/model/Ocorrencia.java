package com.dio.acessPoint.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ocorrencia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String descricao;
}
