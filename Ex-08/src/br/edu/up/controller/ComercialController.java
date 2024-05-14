package br.edu.up.controller;

import java.util.ArrayList;

import br.edu.up.model.listas.ComercialLista;
import br.edu.up.model.modelos.Comercial;
import br.edu.up.view.ComercialView;
import br.edu.up.view.ContatoView;

public class ComercialController {
  public static void adicionarComercial(ComercialLista listaComercial, Comercial comercial) {
    ArrayList<Comercial> contatosPessoais = listaComercial.getContatosComerciais();
    contatosPessoais.add(comercial);
    ComercialView.contatoAddSucesso(comercial);
  }

  public static void mostrarListaComercial(ComercialLista listaComercial) {
    for (Comercial comercial : listaComercial) {
      ComercialView.visualizar(comercial);
    }
  }

  public static Comercial buscarComercial(ComercialLista contatosComercial, int codigo) {
    for (Comercial comercial : contatosComercial) {
      if(comercial.getCodigo() == codigo) {
        return comercial;
      }
    }
    return null;
  }

  public static void removerPessoal(ComercialLista contatosPessoal, int codigo) {
    Comercial pessoal = buscarComercial(contatosPessoal, codigo);

    if(pessoal == null) {
      ContatoView.contatoRemovidoFalha(codigo);
    }

    ContatoView.contatoRemovidoSucesso(codigo);
  }
}
