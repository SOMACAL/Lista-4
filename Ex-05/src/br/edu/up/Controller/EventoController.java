package br.edu.up.Controller;

import br.edu.up.model.Evento;
import br.edu.up.model.Reserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoController {
    private List<Evento> eventos;
    private List<Reserva> reservas;

    public EventoController() {
        this.eventos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Métodos para eventos
    public void adicionarEvento(String nome, LocalDate data, String local, int lotacaoMaxima, double precoIngresso) {
        Evento evento = new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public void excluirEvento(Evento evento) {
        eventos.remove(evento);
    }

    // Métodos para reservas
    public void fazerReserva(String responsavel, int quantidadePessoas, Evento evento) {
        double valorTotal = quantidadePessoas * evento.getPrecoIngresso();
        Reserva reserva = new Reserva(responsavel, quantidadePessoas, evento.getData(), valorTotal);
        reservas.add(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }

    public void excluirReserva(Reserva reserva) {
        reservas.remove(reserva);
    }
}
