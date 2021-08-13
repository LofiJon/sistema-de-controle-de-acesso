package com.dio.acessPoint.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class ActivityLogId implements Serializable {
        private Long idMovimentacao;
        private Long idUsuario;
    }

    @EmbeddedId
    private ActivityLogId activityLogId;
    private LocalDateTime entryDate;
    private LocalDateTime departureDate;
    private BigDecimal activityPeriod;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
