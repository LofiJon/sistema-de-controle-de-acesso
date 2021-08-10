package com.dio.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table( name = "jornadaTrabalho")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class JornadaTrabalho {

    private long id;

    @Lob
    private  String descricao;
}
