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
public class Aluno {
    
    String nome;
    String cpf;
    int idade;
    String genero;
    String responsavel;
    double notas; 
    String matricula;
    List<Disciplina> disciplinas = new ArrayList<>();
    String turma;
}

