package com.example.demo.Model;

public class Procedimentos {

    private String nome;
    private String descricao;
    private Integer duracao;
    private Integer valor;
    private status status;

    enum status{
        ATIVO,
        INATIVO
    }

    public Procedimentos(String nome, String descricao, Integer duracao, Integer valor, status status){
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.valor = valor;
        this.status = status;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }
}
