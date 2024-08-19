package br.com.matheuscrivellaro.gestorfinancasapi.domain.data;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_TRANSACOES")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valor;
    private String descricao;
    private LocalDateTime data;

    @ManyToOne
    private Categoria categoria;

    public Transacao(Double valor, String descricao, LocalDateTime data, Categoria categoria) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
        this.categoria = categoria;
    }
}
