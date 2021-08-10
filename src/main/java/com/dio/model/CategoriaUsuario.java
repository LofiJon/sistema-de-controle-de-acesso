package com.dio.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table(name = "categoriaUsuario")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CategoriaUsuario {
}
