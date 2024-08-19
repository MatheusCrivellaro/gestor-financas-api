package br.com.matheuscrivellaro.gestorfinancasapi.domain.data.orcamento;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.data.Categoria;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "TB_ORCAMENTOS_CATEGORIA")
@Data
public class OrcamentoCategoria extends Orcamento{

    private Categoria categoria;

}
