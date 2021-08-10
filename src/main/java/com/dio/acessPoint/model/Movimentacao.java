package com.dio.acessPoint.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Movimentacao {

    @EmbeddedId
    private MovimentacaoId id;

    private LocalDateTime dataEntrada;

    private LocalDateTime dataSaida;

    private BigDecimal periodo;

    private Ocorrencia ocorrencia;

    private Calendario calendario;

    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public class MovimentacaoId implements Serializable {
        private long idMovimentacao;
        private long idUsuario;
    }

}
