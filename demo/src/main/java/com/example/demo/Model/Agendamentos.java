package com.example.demo.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamentos {

    private LocalDate data;
    private LocalTime horaIncio;
    private LocalTime horaFim;
    private Integer valorTotal;
    private final situacao situacao;


    enum situacao{
        AGENDADO,
        CONCLUIDO,
        CANCELADO
    }

    public Agendamentos(LocalDate data, LocalTime horaIncio, LocalTime horaFim, Integer valorTotal, situacao situacao){
        this.data = data;
        this.horaIncio = horaIncio;
        this.horaFim = horaFim;
        this.valorTotal = valorTotal;
        this.situacao = situacao;
    }

    //Getters e Setters

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHoraIncio() {
        return horaIncio;
    }

    public void setHoraIncio(LocalTime horaIncio) {
        this.horaIncio = horaIncio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }

    public situacao getSituacao() {
        return situacao;
    }
}
