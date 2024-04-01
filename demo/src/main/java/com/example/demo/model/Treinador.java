package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Treinador extends Jogadores{

    private int vitorias;
    public Treinador() {
    }

    public Treinador(String nome, String cpf, String idade, String altura, double salario, String posicao, String time, int vitorias) {
        super(nome, cpf, idade, altura, salario, posicao, time);
        this.vitorias = vitorias;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}
