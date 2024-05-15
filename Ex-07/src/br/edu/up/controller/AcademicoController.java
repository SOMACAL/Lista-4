package br.edu.up.controller;

import br.edu.up.model.*;

import java.util.ArrayList;
import java.util.List;

public class AcademicoController {
    private List<Disciplina> disciplinas;

    public AcademicoController() {
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(String nome, String identificador, String curriculo, Professor professor, List<Aluno> alunos, List<Competencia> competenciasNecessarias, List<Competencia> competenciasComplementares) {
        // Implementar a lógica para adicionar disciplina
    }

    public void adicionarAluno(String identificadorDisciplina, Aluno aluno) {
        // Implementar a lógica para adicionar aluno
    }

    public void adicionarCompetenciaNecessaria(String identificadorDisciplina, Competencia competencia) {
        // Implementar a lógica para adicionar competência necessária
    }

    public void adicionarCompetenciaComplementar(String identificadorDisciplina, Competencia competencia) {
        // Implementar a lógica para adicionar competência complementar
    }

    public List<Disciplina> listarDisciplinas() {
        // Implementar a lógica para listar disciplinas
        return null;
    }

    // Métodos adicionais conforme necessário
}
