package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private double salario;
    private List<Disciplina> disciplinas;
    private List<Turma> turmas;
    private List<Aluno> alunos;

    public Professor(String nome, String cpf, int idade, String genero, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.salario = salario;
        this.disciplinas = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void verificarDisciplinas() {
        System.out.println("Disciplinas do professor " + nome + ":");
        for (Disciplina d : disciplinas) {
            System.out.println("- " + d.getNome());
        }
    }

    public void inserirNotas(Aluno aluno, double[] notas) {
        aluno.setNotas(notas);
        definirSituacaoAcademicaDoAluno(aluno);
    }

    public void colocarPresenca(Aluno aluno, Disciplina disciplina) {
        System.out.println("Presença registrada para " + aluno.getNome() + " na disciplina " + disciplina.getNome() + ".");
    }

    public void verificarCronogramaDasDisciplinas() {
        System.out.println("Cronograma das disciplinas do professor " + nome + ":");
        for (Disciplina d : disciplinas) {
            System.out.println(d.getNome() + " - " + d.getHorario());
        }
    }

    public void verificarPresenca(Aluno aluno) {
        System.out.println("Verificando presença do aluno " + aluno.getNome() + ".");
    }

    public void definirSituacaoAcademicaDoAluno(Aluno aluno) {
        double media = aluno.calcularMedia();
        if (media >= 7.0) {
            System.out.println("Aluno " + aluno.getNome() + " está APROVADO com média " + media + ".");
        } else {
            System.out.println("Aluno " + aluno.getNome() + " está REPROVADO com média " + media + ".");
        }
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
