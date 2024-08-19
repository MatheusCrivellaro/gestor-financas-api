package br.com.matheuscrivellaro.gestorfinancasapi.domain.data;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.enumerations.Periodo;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TB_METAS")
@Data
public class Meta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private Double meta;
    private String quantiaAtual;
    private Periodo periodo;

}
