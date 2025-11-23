package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String horario;
    private List<Professor> professores;
    private List<Turma> turmas;
    private List<Aluno> alunos;

    public Disciplina(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void exibirGradeDeHorario() {
        System.out.println("Disciplina: " + nome + " - Horário: " + horario);
    }

    public void exibirProfessores() {
        System.out.println("Professores da disciplina " + nome + ":");
        for (Professor p : professores) {
            System.out.println("- " + p.getNome());
        }
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
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

    public String getHorario() {
        return horario;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
