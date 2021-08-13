package com.dio.acessPoint.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JornadaTrabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
