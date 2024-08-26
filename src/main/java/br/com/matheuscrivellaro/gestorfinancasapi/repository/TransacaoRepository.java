package br.com.matheuscrivellaro.gestorfinancasapi.repository;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.data.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {



}
