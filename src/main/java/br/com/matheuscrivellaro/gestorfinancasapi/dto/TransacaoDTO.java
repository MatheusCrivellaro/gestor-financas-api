package br.com.matheuscrivellaro.gestorfinancasapi.dto;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.data.Categoria;

import java.time.LocalDateTime;

public record TransacaoDTO(

        String id,
        String descricao,
        Double valor,
        LocalDateTime data,
        Long categoria

) {
}
