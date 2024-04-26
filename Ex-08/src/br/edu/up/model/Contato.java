package br.edu.up.model;

public abstract class Contato {
  private int codigo;
  private String nome;
  private String telefone;

  public Contato() {
    
  }
  
  public Contato(int codigo, String nome, String telefone) {
    this.codigo = codigo;
    this.nome = nome;
    this.telefone = telefone;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String toString(int numero) {
    return Integer.toString(numero);
  }
}
