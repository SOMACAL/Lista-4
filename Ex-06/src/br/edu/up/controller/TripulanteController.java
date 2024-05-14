package br.edu.up.controller;

import br.edu.up.model.Listas.ListaTripulantes;
import br.edu.up.model.Modelos.Tripulacao;

public class TripulanteController {
  public Tripulacao buscarTripulante(ListaTripulantes tripulantes, String matricula) {
    for (Tripulacao tripulante : tripulantes) {
      if (tripulante.getMatricula().equals(matricula)) {
        return tripulante;
      }
    }
    return null;
  }
}
