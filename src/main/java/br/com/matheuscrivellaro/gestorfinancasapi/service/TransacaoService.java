package br.com.matheuscrivellaro.gestorfinancasapi.service;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.data.Transacao;
import br.com.matheuscrivellaro.gestorfinancasapi.dto.TransacaoDTO;
import br.com.matheuscrivellaro.gestorfinancasapi.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repository;

    public TransacaoDTO create(TransacaoDTO dto) {
        repository.save(new Transacao(
                dto.valor(),
                dto.descricao(),
                dto.data(),
                dto.categoria()
        ));
    }

}
