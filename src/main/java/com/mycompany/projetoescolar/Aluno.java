package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private double[] notas;
    private String matricula;
    private List<Disciplina> disciplinas;
    private Turma turma;

    public Aluno(String nome, String cpf, int idade, String genero, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.matricula = matricula;
        this.notas = new double[4];
        this.disciplinas = new ArrayList<>();
    }

    public void verSuasNotas() {
        System.out.println("Notas do aluno " + nome + ":");
        for (int i = 0; i < notas; i++) {
            System.out.println("Nota " + (i + 1) +);
        }
        System.out.println("Média: " + calcularMedia());
    }

    public void consultarFrequencias() {
        System.out.println("Consultando frequências do aluno " + nome + ".");
    }

    public void consultarHistorico() {
        System.out.println("Consultando histórico escolar do aluno " + nome + ".");
    }

    public void consultarComprovanteMatricula() {
        System.out.println("Comprovante de matrícula do aluno " + nome + ": " + matricula + ".");
    }

    public void consultarGradeDeHorario() {
        System.out.println("Grade de horário do aluno " + nome + ":");
        if (turma != null) {
            System.out.println("Turma: " + turma.getIdentificador() + " - Horário: " + turma.getHorario());
        } else {
            System.out.println("Nenhuma turma associada.");
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) {
            soma + n;
        }
        return soma / notas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        if (notas != null && notas.length == 4) {
            this.notas = notas;
        }
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
