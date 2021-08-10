package com.dio.acessPoint.model;

import lombok.*;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Localidade {

    private Long id;

    @OneToMany
    private NivelAcesso nivelAcesso;

    private  String descricao;
}
