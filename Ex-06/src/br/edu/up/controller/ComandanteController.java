package br.edu.up.controller;

import br.edu.up.model.Listas.ListaComandantes;
import br.edu.up.model.Modelos.Comandante;

public class ComandanteController {
  public Comandante buscarComandante(ListaComandantes comandantes, String rg) {
    for (Comandante comandante : comandantes) {
      if (comandante.getRg().equals(rg)) {
        return comandante;
      }
    }
    return null;
  }
}
