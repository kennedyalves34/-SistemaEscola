package com.mycompany.projetoescolar;

public class ProjetoEscolar {
    public static void main(String[] args) {
        Escola escola = new Escola("Escola Modelo", "Ana Souza");

        Professor professor1 = new Professor(
                "Maria Virginia",
                "40028922",
                24,
                "Feminino",
                1518.0
        );

        Aluno aluno1 = new Aluno(
                "Tiago GamesEdu",
                "12345678",
                22,
                "Masculino",
                "Dilma Rouseff",
                "1234"
        );

        Turma turma1 = new Turma(
                "1º Ano A",
                "Manhã",
                "Sala 101"
        );

        Disciplina java = new Disciplina(
                "Java",
                "08:00 - 09:30"
        );

        Colaborador colaborador1 = new Colaborador(
                "Pedro Santos",
                "444.444.444-44",
                30,
                "Masculino",
                "Limpeza",
                1500.0
        );

        escola.contratarProfessor(professor1);
        escola.matricularAluno(aluno1);
      //escola.matricularAluno(aluno2);
        escola.adicionarTurma(turma1);
        escola.contratarColaborador(colaborador1);
        escola.definirEscalaDoColaborador(colaborador1, "Segunda a sexta, 08h às 17h");

        turma1.definirLimiteDeAlunos(40);
        turma1.inserirProfessorNaTurma(professor1);
        turma1.inserirAlunoNaTurma(aluno1);
       //urma1.inserirAlunoNaTurma(aluno2);

        professor1.adicionarDisciplina(java);
        professor1.adicionarTurma(turma1);
        professor1.adicionarAluno(aluno1);
       //rofessor1.adicionarAluno(aluno2);

        java.adicionarProfessor(professor1);
        java.adicionarTurma(turma1);
        java.adicionarAluno(aluno1);
      //java.adicionarAluno(aluno2);

        double[] notasAluno1 = {8.0, 7.5, 9.0, 8.5};
        professor1.inserirNotas(aluno1, notasAluno1);

        aluno1.verSuasNotas();
        aluno1.consultarFrequencias();
        aluno1.consultarHistorico();
        aluno1.consultarComprovanteMatricula();
        aluno1.consultarGradeDeHorario();

        professor1.verificarDisciplinas();
        professor1.verificarCronogramaDasDisciplinas();
        professor1.verificarPresenca(aluno1);
        professor1.colocarPresenca(aluno1, java);

        java.exibirGradeDeHorario();
        java.exibirProfessores();

        turma1.exibirAlunos();

        colaborador1.verificarEscalaDeTrabalho();
        colaborador1.baterPonto();

        escola.orientarAluno(aluno1, "Melhorar a participação nas aulas de Java.");
        escola.suspenderProfessor(professor1);
        escola.suspenderColaborador(colaborador1);
    }
}
