package br.edu.up.model;
import java.time.LocalDate;

public class Reserva {
    private String responsavel;
    private int quantidadePessoas;
    private LocalDate dataReserva;
    private double valorTotal;

    public Reserva(String responsavel, int quantidadePessoas, LocalDate dataReserva, double valorTotal) {
        this.responsavel = responsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters
    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "responsavel='" + responsavel + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", dataReserva=" + dataReserva +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
