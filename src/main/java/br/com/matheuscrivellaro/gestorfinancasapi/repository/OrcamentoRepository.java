package br.com.matheuscrivellaro.gestorfinancasapi.repository;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.data.orcamento.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
}
