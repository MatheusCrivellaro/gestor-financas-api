package br.com.matheuscrivellaro.gestorfinancasapi.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Long id) {
        super("Recurso não encontrado: ID " + id);
    }
}
