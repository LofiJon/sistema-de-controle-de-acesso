package com.dio.acessPoint.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "categoria_usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
