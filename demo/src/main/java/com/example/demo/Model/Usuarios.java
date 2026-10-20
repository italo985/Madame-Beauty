package com.example.demo.Model;


public class Usuarios {

    private String nome;
    private String login;
    private String senhaHash;
    private perfil perfil;
    private status status;

    enum perfil{
        ADM,
        RECEPCIONISTA
    }

    enum status{
        ATIVO,
        INATIVO
    }

    public Usuarios(String nome, String login, String senhaHash, perfil perfil, status status){

        this.nome = nome;
        this.login = login;
        this.senhaHash = senhaHash;
        this.perfil = perfil;
        this.status = status;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(perfil perfil) {
        this.perfil = perfil;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

}
