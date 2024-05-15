package br.edu.up.model;

import java.util.List;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private Professor professor;
    private List<Aluno> alunos;
    private List<Competencia> competenciasNecessarias;
    private List<Competencia> competenciasComplementares;

    public Disciplina(String nome, String identificador, String curriculo, Professor professor, List<Aluno> alunos, List<Competencia> competenciasNecessarias, List<Competencia> competenciasComplementares) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.alunos = alunos;
        this.competenciasNecessarias = competenciasNecessarias;
        this.competenciasComplementares = competenciasComplementares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Competencia> getCompetenciasNecessarias() {
        return competenciasNecessarias;
    }

    public void setCompetenciasNecessarias(List<Competencia> competenciasNecessarias) {
        this.competenciasNecessarias = competenciasNecessarias;
    }

    public List<Competencia> getCompetenciasComplementares() {
        return competenciasComplementares;
    }

    public void setCompetenciasComplementares(List<Competencia> competenciasComplementares) {
        this.competenciasComplementares = competenciasComplementares;
    }
}
