package br.edu.up.controller;

import br.edu.up.model.Listas.ListaPassagens;
import br.edu.up.model.Modelos.Passagem;

public class PassagemController {
    public Passagem buscarPassagem(ListaPassagens passagens, int idPassagem) {
    for (Passagem passagem : passagens) {
      if (passagem.getId() == idPassagem) {
        return passagem;
      }
    }
    return null;
  }
}
