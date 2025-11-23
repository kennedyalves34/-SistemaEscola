package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private String diretor;
    private List<Professor> professores;
    private List<Turma> turmas;
    private List<Aluno> alunos;
    private List<Colaborador> colaboradores;

    public Escola(String nome, String diretor) {
        this.nome = nome;
        this.diretor = diretor;
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.colaboradores = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno matriculado na escola: " + aluno.getNome());
    }

    public void expulsarAluno(Aluno aluno) {
        alunos.remove(aluno);
        if (aluno.getTurma() != null) {
            aluno.getTurma().removerAlunoNaTurma(aluno);
        }
        System.out.println("Aluno expulso da escola: " + aluno.getNome());
    }

    public void orientarAluno(Aluno aluno, String mensagem) {
        System.out.println("Orientação para " + aluno.getNome() + ": " + mensagem);
    }

    public void contratarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor contratado: " + professor.getNome());
    }

    public void demitirProfessor(Professor professor) {
        professores.remove(professor);
        System.out.println("Professor demitido: " + professor.getNome());
    }

    public void suspenderProfessor(Professor professor) {
        System.out.println("Professor " + professor.getNome() + " foi suspenso.");
    }

    public void contratarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
        System.out.println("Colaborador contratado: " + colaborador.getNome());
    }

    public void demitirColaborador(Colaborador colaborador) {
        colaboradores.remove(colaborador);
        System.out.println("Colaborador demitido: " + colaborador.getNome());
    }

    public void suspenderColaborador(Colaborador colaborador) {
        System.out.println("Colaborador " + colaborador.getNome() + " foi suspenso.");
    }

    public void definirEscalaDoColaborador(Colaborador colaborador, String escala) {
        colaborador.setEscalaDeTrabalho(escala);
        System.out.println("Escala definida para " + colaborador.getNome() + ": " + escala);
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
        System.out.println("Turma adicionada à escola: " + turma.getIdentificador());
    }

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
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

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }
}
