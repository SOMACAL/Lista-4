package br.edu.up.controller;

import java.util.ArrayList;
import br.edu.up.model.lista.ListaSeguro;
import br.edu.up.model.modelo.Seguro;
import br.edu.up.model.modelo.SeguroVeiculo;
import br.edu.up.view.SeguroView;

public class SeguroVeiculoController {
  public static SeguroVeiculo incluir(ListaSeguro seguros, SeguroVeiculo seguroVeiculo) {
    SeguroVeiculo seguroBuscado = localizar(seguros, seguroVeiculo.getApolice());

    if (seguroBuscado != null) {
      SeguroView.seguroJaIncluso();
      return null;
    }

    ArrayList<Seguro> segurosLista = seguros.getListaSeguro();
    
    segurosLista.add(seguroVeiculo);
    
    return seguroVeiculo;
  }

  public static SeguroVeiculo localizar(ListaSeguro seguros, String apolice) {
    for (Seguro seguroVida : seguros) {
      if (seguroVida.getApolice().equals(apolice)) {
        return (SeguroVeiculo) seguroVida;
      }
    }

    return null;
  }
}
