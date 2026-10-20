package com.example.demo.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sessoes {
    private String tokenHash;
    private LocalDateTime dataCriacao;
    private LocalDateTime ultimaAtividade;
    private status status;

    enum status{
        ATIVA,
        ENCERRADA,
        EXPIRADA
    }

    //Getters e Setters

    public String getTokenHash() {
        return tokenHash;
    }

    public void setTokenHash(String tokenHash) {
        this.tokenHash = tokenHash;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getUltimaAtividade() {
        return ultimaAtividade;
    }

    public void setUltimaAtividade(LocalDateTime ultimaAtividade) {
        this.ultimaAtividade = ultimaAtividade;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }
}
