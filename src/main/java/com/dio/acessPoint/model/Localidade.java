package com.dio.acessPoint.model;

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Localidade {

    private Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private  String descricao;
}
