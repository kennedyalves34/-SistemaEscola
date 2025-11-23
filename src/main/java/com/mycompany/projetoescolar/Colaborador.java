package com.mycompany.projetoescolar;

public class Colaborador {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private String cargo;
    private double salario;
    private String escalaDeTrabalho;

    public Colaborador(String nome, String cpf, int idade, String genero, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.cargo = cargo;
        this.salario = salario;
        this.escalaDeTrabalho = "";
    }

    public void verificarEscalaDeTrabalho() {
        System.out.println("Escala de trabalho de " + nome + ": " + escalaDeTrabalho);
    }

    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }

    public String getNome() {
        return nome;
    }

    public String getEscalaDeTrabalho() {
        return escalaDeTrabalho;
    }

    public void setEscalaDeTrabalho(String escalaDeTrabalho) {
        this.escalaDeTrabalho = escalaDeTrabalho;
    }
}
