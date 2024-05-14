package br.edu.up.model.listas;

import java.util.ArrayList;
import java.util.Iterator;

import br.edu.up.model.modelos.Pessoal;

public class PessoalLista implements Iterable<Pessoal> {
  private ArrayList<Pessoal> contatosPessoais;

  public PessoalLista() {
    this.contatosPessoais = new ArrayList<Pessoal>();
  }

  public void setContatosPessoais(ArrayList<Pessoal> contatosPessoais) {
    this.contatosPessoais = contatosPessoais;
  }

  public ArrayList<Pessoal> getContatosPessoais() {
    return contatosPessoais;
  }

  @Override
  public Iterator<Pessoal> iterator() {
    return contatosPessoais.iterator();
  }
}
