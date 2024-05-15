package br.edu.up.model;

public class Professor {
    private String nome;
    private String rg;
    private String matricula;
    private String lattes;
    private String titulacao;
    private String instituicao;
    private int anoConclusao;
    private String tituloObtido;
    private String tituloTrabalho;

    public Professor(String nome, String rg, String matricula, String lattes, String titulacao, String instituicao, int anoConclusao, String tituloObtido, String tituloTrabalho) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
        this.lattes = lattes;
        this.titulacao = titulacao;
        this.instituicao = instituicao;
        this.anoConclusao = anoConclusao;
        this.tituloObtido = tituloObtido;
        this.tituloTrabalho = tituloTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLattes() {
        return lattes;
    }

    public void setLattes(String lattes) {
        this.lattes = lattes;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getTituloObtido() {
        return tituloObtido;
    }

    public void setTituloObtido(String tituloObtido) {
        this.tituloObtido = tituloObtido;
    }

    public String getTituloTrabalho() {
        return tituloTrabalho;
    }

    public void setTituloTrabalho(String tituloTrabalho) {
        this.tituloTrabalho = tituloTrabalho;
    }
}
