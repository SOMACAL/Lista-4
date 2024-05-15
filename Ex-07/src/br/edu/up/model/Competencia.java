package br.edu.up.model;

public class Competencia {
    private String nome;
    private TipoCompetencia tipo;
    private boolean atingida;

    public Competencia(String nome, TipoCompetencia tipo, boolean atingida) {
        this.nome = nome;
        this.tipo = tipo;
        this.atingida = atingida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCompetencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoCompetencia tipo) {
        this.tipo = tipo;
    }

    public boolean isAtingida() {
        return atingida;
    }

    public void setAtingida(boolean atingida) {
        this.atingida = atingida;
    }
}
