/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

/**
 *
 * @author KENNEDYALVESSOARES
 */
public class Colaborador {
    public String nome;
    private String cpf;
    public int idade;
    private String genero;
    public String cargo;
    private double salario;
    
    public Colaborador(String nome, String cpf, int idade, String genero, 
                       String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.cargo = cargo;
        this.salario = salario;        
        
    }
    
    void verificarEscalaDeTrabalho() {
        // verifica o cargo
        // define os horarios de acordo com o cargo
        
    }
    void baterPonto(String horario_inicio, String horario_almoco,
               String horario_fim_almoco, String fim_horario) {
        
    }
    
}
