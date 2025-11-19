/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KENNEDYALVESSOARES
 */
public class Escola {
    String nome;
    String diretor;
    List<Professor> professores = new ArrayList<>();
    List<Aluno> alunos = new ArrayList<>();
    List<Turma> turmas = new ArrayList<>() ;
    List<Colaborador> colaboradores = new ArrayList<>();
    
    public Escola(String nome, String diretor) {
        this.nome = nome;
        this.diretor = diretor;
        this.alunos = null;
        this.professores = null;
        this.turmas = null;
        this.colaboradores = null;
    }
    //metodos
    void matriculaAluno(){
        Turma quintoAno = new Turma("Quinto Ano");
        
       boolean podeCadastrar =  quintoAno.DefinirLimiteDeAlunos(20);
       if (podeCadastrar == true){
           System.out.println("Cadastro finalizado!");
       }else{
           System.out.println("Excedeu o limite da turma!"); 
       }
       
    }
    void matricularProfessor() {
        Professor professor1 = new Professor("João", "71420540844", 45, "Masculino");
        professores.add(professor1);
        Turma primeiroAno = new Turma("Primeiro ano");
        inserirProfessorNaTurma(professor1.nome, primeiroAno.identificador);
        turmas.add(primeiroAno);
    }
     public void inserirProfessorNaTurma(String professores, String turma) {
        System.out.println("O professor " + professores + ", foi inserido na " + turma);
        
        
        
        
        
    }
    
    
}
