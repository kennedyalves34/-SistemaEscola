/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author KENNEDYALVESSOARES
 */
public class Turma {
    String identificador; 
    List<Aluno> alunos = new ArrayList<>();
    String horarios;
    String local;
    List<Professor> professores = new ArrayList<>();  
    public Turma (String identificador){
    this.identificador = identificador;
    this.alunos = null;
    this.horarios = "";
    this.local = "";
    this.professores = null;
    
    
    }
   
    
    
    // Metodos
    public boolean DefinirLimiteDeAlunos(int quantidade){
        if (quantidade > 30){
            return false;
        }
        return true;
    }
    public void InserirProfessoresNaTurma(String professores, String turma) {
        System.out.println("O professor " + professores + ", foi inserido na " + turma);
        
        
        
        
        
    }
    void InserirAlunosNaTurma(){
        
    }
    
    void RemoverProfessoresNaTurma() {
        
        
    }
    
    void RemoverAlunosNaTurma() {
        
        
    }
    
    
    
    
    
    
}
