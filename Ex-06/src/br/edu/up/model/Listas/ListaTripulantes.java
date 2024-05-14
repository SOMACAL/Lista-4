package br.edu.up.model.Listas;

import java.util.ArrayList;
import java.util.Iterator;

import br.edu.up.model.Modelos.Tripulacao;

public class ListaTripulantes implements Iterable<Tripulacao> {
  private ArrayList<Tripulacao> tripulantes;

  public ListaTripulantes() {
    this.tripulantes = new ArrayList<Tripulacao>();
  }

  public ArrayList<Tripulacao> getTripulantes() {
    return tripulantes;
  }

  public void adicionarTripulante(Tripulacao tripulante) {
    this.tripulantes.add(tripulante);
  }

  @Override
  public Iterator<Tripulacao> iterator() {
    return tripulantes.iterator();
  }
}
