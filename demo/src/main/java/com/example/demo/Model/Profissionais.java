package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profissionais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProfissional;

    private String nome;

    private String registroProfissional;

    private String tempo;

    private double valor;

    private String status;

        public Profissionais(String nome, String registroProfissional, String tempo, double valor, String status){
            this.nome = nome;
            this.registroProfissional = registroProfissional;
            this.tempo = tempo;
            this.valor = valor;
            this.status = status;
        }

    //Getters e Setters

    public long getId() {
        return idProfissional;
    }

    public void setId(long id) {
        this.idProfissional = idProfissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
