package com.example.demo.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {

    private String nome;
    private String cpf;
    private String idade;
    private String altura;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String idade, String altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
