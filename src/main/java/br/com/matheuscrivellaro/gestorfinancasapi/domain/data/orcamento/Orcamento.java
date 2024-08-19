package br.com.matheuscrivellaro.gestorfinancasapi.domain.data.orcamento;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.enumerations.Periodo;
import jakarta.persistence.*;
import lombok.Data;

@Table(name = "TB_ORCAMENTOS")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private Double valor;
    private Periodo periodo;

}
