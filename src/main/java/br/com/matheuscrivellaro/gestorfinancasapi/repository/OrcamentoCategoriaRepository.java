package br.com.matheuscrivellaro.gestorfinancasapi.repository;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.data.orcamento.OrcamentoCategoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrcamentoCategoriaRepository extends JpaRepository<OrcamentoCategoria, Long> {
}
