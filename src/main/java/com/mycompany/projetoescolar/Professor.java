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
public class Professor {
  String nome;
  String cpf;
  int idade;
  String genero;
  double salario; 
  List<Disciplina> disciplinas = new ArrayList<>();
  List<Turma> turmas = new ArrayList<>();
  List<Aluno> alunos = new ArrayList<>(); 
  
  public Professor(String nome, String cpf, int idade, String genero) {
  this.nome = nome;
  this.cpf = cpf;
  this.idade = idade;
  this.genero = genero;
  this.salario = 0.0;
  this.disciplinas = null;
  this.turmas = null;
  this.alunos = null;
   
  }
    
}



