package br.edu.up.model;
public class ClientePessoa extends Cliente {
    private static final double MAX_CREDITO = 10000;

    public ClientePessoa(String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    protected double getMaxCredito() {
        return MAX_CREDITO;
    }
}
