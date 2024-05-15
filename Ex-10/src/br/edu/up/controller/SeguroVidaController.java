package br.edu.up.controller;

import java.util.ArrayList;

import br.edu.up.model.lista.ListaSeguro;
import br.edu.up.model.modelo.Seguro;
import br.edu.up.model.modelo.SeguroVida;
import br.edu.up.view.SeguroView;

public class SeguroVidaController {
  public static SeguroVida incluir(ListaSeguro seguros, SeguroVida seguroVida) {
    SeguroVida seguroBuscado = localizar(seguros, seguroVida.getApolice());

    if (seguroBuscado != null) {
      SeguroView.seguroJaIncluso();
      return null;
    }

    ArrayList<Seguro> listaSeguros = seguros.getListaSeguro();

    listaSeguros.add(seguroVida);

    return seguroVida;
  }

  public static SeguroVida localizar(ListaSeguro seguros, String apolice) {
    for (Seguro seguroVida : seguros) {
      if (seguroVida.getApolice().equals(apolice)) {
        return (SeguroVida) seguroVida;
      }
    }

    return null;
  }
}