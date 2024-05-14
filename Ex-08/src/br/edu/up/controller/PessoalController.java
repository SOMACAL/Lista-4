package br.edu.up.controller;

import java.util.ArrayList;
import br.edu.up.model.listas.PessoalLista;
import br.edu.up.model.modelos.Pessoal;
import br.edu.up.view.ContatoView;
import br.edu.up.view.PessoalView;

public class PessoalController {
  public static void adicionarPessoal(PessoalLista listaPessoal, Pessoal pessoal) {
    ArrayList<Pessoal> contatosPessoais = listaPessoal.getContatosPessoais();
    contatosPessoais.add(pessoal);
    PessoalView.contatoAddSucesso(pessoal);
  }

  public static void mostrarListaPessoal(PessoalLista listaPessoal) {
    for (Pessoal pessoal : listaPessoal) {
      PessoalView.visualizar(pessoal);
    }
  }

  public static Pessoal buscarPessoal(PessoalLista contatosPessoal, int codigo) {
    for (Pessoal pessoal : contatosPessoal) {
      if(pessoal.getCodigo() == codigo) {
        return pessoal;
      }
    }
    return null;
  }

  public static void removerPessoal(PessoalLista contatosPessoal, int codigo) {
    Pessoal pessoal = buscarPessoal(contatosPessoal, codigo);

    if(pessoal == null) {
      ContatoView.contatoRemovidoFalha(codigo);
    }

    ContatoView.contatoRemovidoSucesso(codigo);
  }
}
