package br.com.matheuscrivellaro.gestorfinancasapi.service;

import br.com.matheuscrivellaro.gestorfinancasapi.domain.data.Transacao;
import br.com.matheuscrivellaro.gestorfinancasapi.dto.TransacaoDTO;
import br.com.matheuscrivellaro.gestorfinancasapi.exception.ResourceNotFoundException;
import br.com.matheuscrivellaro.gestorfinancasapi.repository.TransacaoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransacaoService {

    @Autowired
    private TransacaoRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<TransacaoDTO> findAll() {
        return repository.findAll().stream().map(transacao -> modelMapper.map(transacao, TransacaoDTO.class)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public TransacaoDTO findById(Long id) {
        Transacao entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        return modelMapper.map(entity, TransacaoDTO.class);
    }

}
