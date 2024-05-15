package br.edu.up.controller;

import java.util.ArrayList;
import br.edu.up.model.lista.ListaSegurado;
import br.edu.up.model.modelo.Segurado;
import br.edu.up.view.SeguradoView;

public class SeguradoController {
  public static Segurado adicionar(ListaSegurado segurados) {
    String rgBuscado = SeguradoView.localizarRg();
    Segurado seguradoBuscado = localizarPorRg(segurados, rgBuscado);
    
    if(seguradoBuscado != null) {
      SeguradoView.seguradoJaCadastrado();
      return null;
    }

    Segurado segurado = SeguradoView.adicionar();
    segurado.setRg(rgBuscado);

    segurados.add(segurado);
    SeguradoView.adicionadoSucesso(segurado);

    return segurado;
  }

  public static Segurado localizarPorRg(ListaSegurado segurados, String rg) {
    for (Segurado segurado : segurados) {
      if (segurado.getRg().equals(rg)) {
        return segurado;
      }
    }

    return null;
  }

  public static void excluir(ListaSegurado segurados, String rg) {
    Segurado seguradoBuscado = localizarPorRg(segurados, rg);

    if(seguradoBuscado == null) {
      SeguradoView.seguradoNaoLocalizado();
      return;
    }

    ArrayList<Segurado> seguradosLista = segurados.getListaSegurado();

    seguradosLista.remove(seguradoBuscado);
    SeguradoView.seguradoExcluido(rg);
  }

  public static void visualizarTodos(ListaSegurado segurados) {
    for(Segurado segurado : segurados) {
      SeguradoView.visualizar(segurado);
    }
  }
}
