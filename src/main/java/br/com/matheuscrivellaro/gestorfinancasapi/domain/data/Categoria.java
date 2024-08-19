package br.com.matheuscrivellaro.gestorfinancasapi.domain.data;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "TB_CATEGORIAS")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private String color;

    @OneToMany(mappedBy = "categoria")
    private List<Transacao> transacoes;

}
