package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Jogadores extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    @Min(value = 1)
    private double salario;

    @Pattern(regexp = "(Central|Levantador|Oposto|Libero|Ponteiro|Treinador)", message = "Posição inexistente")
    private String posicao;

    private String time;

    public Jogadores() {
    }

    public Jogadores(String nome, String cpf, String idade, String altura, double salario, String posicao, String time) {
        super(nome, cpf, idade, altura);
        this.salario = salario;
        this.posicao = posicao;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
