package br.edu.up.controller;

import java.util.ArrayList;

import br.edu.up.model.lista.ListaSeguro;
import br.edu.up.model.modelo.SeguroVeiculo;
import br.edu.up.model.modelo.SeguroVida;
import br.edu.up.model.modelo.Seguro;
import br.edu.up.view.SeguroView;

public class SeguroController {
  public static Seguro localizar(ListaSeguro seguros, String apolice) {
    SeguroVida seguroVidaBuscado = SeguroVidaController.localizar(seguros, apolice);

    if (seguroVidaBuscado != null) {
      return seguroVidaBuscado;
    }

    SeguroVeiculo seguroVeiculoBuscado = SeguroVeiculoController.localizar(seguros, apolice);
    if (seguroVeiculoBuscado != null) {
      return seguroVeiculoBuscado;
    }
    
    return null;
  }

  public static void excluir(ListaSeguro seguros, String apolice) {
    SeguroVida seguroVidaBuscado = SeguroVidaController.localizar(seguros, apolice);
    ArrayList<Seguro> listaSeguros = seguros.getListaSeguro();

    if (seguroVidaBuscado == null) {
      SeguroVeiculo seguroVeiculoBuscado = SeguroVeiculoController.localizar(seguros, apolice);

      if (seguroVeiculoBuscado == null) {
        SeguroView.seguroNaoEncontrado();
        return;
      }

      listaSeguros.remove(seguroVeiculoBuscado);
      SeguroView.seguroRemovido();
    }
  }

  public static void excluirTodos(ListaSeguro seguros) {
    ArrayList<Seguro> listaSeguros = seguros.getListaSeguro();
    listaSeguros.clear();
    SeguroView.segurosRemovido();
  }

  public static void contarSeguros(ListaSeguro seguros) {
    ArrayList<Seguro> listaSeguros = seguros.getListaSeguro();

    int qtdSeguros = listaSeguros.size();

    SeguroView.qtdSeguros(qtdSeguros);
  }
}
