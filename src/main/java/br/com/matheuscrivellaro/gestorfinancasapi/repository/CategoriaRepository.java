package br.com.matheuscrivellaro.gestorfinancasapi.repository;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.data.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
