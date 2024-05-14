package br.edu.up.model.modelos;
import java.util.ArrayList;

public class Agenda {
  private ArrayList<Contato> contatos = new ArrayList<Contato>();

  public Agenda() {

  }

  public ArrayList<Contato> getContatos() {
    return contatos;
  }

  public void addComercial(Comercial comercial) {
    contatos.add(comercial);
  }

  public void addPessoal(Pessoal pessoal) {
    contatos.add(pessoal);
  }

  public Contato buscarContato(int codigo) {
    for (Contato contato : contatos) {
      if(contato.getCodigo() == codigo) {
        return contato;
      }
    }
    return null;
  }

  public void excluirContato(int codigo) {
    for (Contato contato : contatos) {
      if(contato.getCodigo() == codigo) {
        contatos.remove(contato);
      }
    }
  }
}
