package br.edu.up.model;
public class ClienteEmpresa extends Cliente {
    private static final double MAX_CREDITO = 25000;

    public ClienteEmpresa(String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    protected double getMaxCredito() {
        return MAX_CREDITO;
    }
}
