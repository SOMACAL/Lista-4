package br.edu.up.model;
public abstract class Cliente {
    private String nome;
    private String endereco;
    private double vlrEmprestado;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.vlrEmprestado = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public void emprestar(double valor) {
        if (valor > 0 && valor <= getMaxCredito()) {
            vlrEmprestado += valor;
        } else {
            System.out.println("Valor de empréstimo inválido.");
        }
    }

    public void devolver(double valor) {
        if (valor > 0 && vlrEmprestado - valor >= 0) {
            vlrEmprestado -= valor;
        } else {
            System.out.println("Valor de devolução inválido.");
        }
    }

    protected abstract double getMaxCredito();
}
