package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String identificador;
    private List<Aluno> alunos;
    private String horario;
    private String local;
    private List<Professor> professores;
    private int limiteDeAlunos;

    public Turma(String identificador, String horario, String local) {
        this.identificador = identificador;
        this.horario = horario;
        this.local = local;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.limiteDeAlunos = 0;
    }

    public void definirLimiteDeAlunos(int limite) {
        this.limiteDeAlunos = limite;
        System.out.println("Limite de alunos da turma " + identificador + ": " + limite);
    }

    public void inserirProfessorNaTurma(Professor professor) {
        professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " inserido na turma " + identificador + ".");
    }

    public void inserirAlunoNaTurma(Aluno aluno) {
        if (limiteDeAlunos == 0 || alunos.size() < limiteDeAlunos) {
            alunos.add(aluno);
            aluno.setTurma(this);
            System.out.println("Aluno " + aluno.getNome() + " inserido na turma " + identificador + ".");
        } else {
            System.out.println("Não é possível inserir aluno. Limite da turma atingido.");
        }
    }

    public void removerProfessorNaTurma(Professor professor) {
        professores.remove(professor);
        System.out.println("Professor " + professor.getNome() + " removido da turma " + identificador + ".");
    }

    public void removerAlunoNaTurma(Aluno aluno) {
        alunos.remove(aluno);
        if (aluno.getTurma() == this) {
            aluno.setTurma(null);
        }
        System.out.println("Aluno " + aluno.getNome() + " removido da turma " + identificador + ".");
    }

    public void exibirAlunos() {
        System.out.println("Alunos da turma " + identificador + ":");
        for (Aluno a : alunos) {
            System.out.println("- " + a.getNome());
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getHorario() {
        return horario;
    }

    public String getLocal() {
        return local;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}
