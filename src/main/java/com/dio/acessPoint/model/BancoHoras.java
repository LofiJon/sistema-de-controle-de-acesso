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
public class BancoHoras {

    @Id
    @EmbeddedId
    private BancoHorasId id;

    private LocalDateTime dataTrabalhada;

    private BigDecimal quantidadeHorasTrabalhadas;

    private BigDecimal saldoHoras;

    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public class BancoHorasId implements Serializable {
        private long idBancoHora;
        private long idMovimento;
        private long idUsuario;
    }

}
