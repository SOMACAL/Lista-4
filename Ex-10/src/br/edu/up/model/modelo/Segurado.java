package br.edu.up.model.modelo;

public class Segurado {
  private String nome;
  private String rg;
  private String cpf;
  private Enum<EnumGenero> genero;
  private String telefone;
  private String endereco;
  private String cep;
  private String cidade;

  public Segurado() {

  }

  public Segurado(String nome, String rg, String cpf, Enum<EnumGenero> genero, String telefone, String endereco, String cep, String cidade) {
    this.nome = nome;
    this.rg = rg;
    this.cpf = cpf;
    this.genero = genero;
    this.telefone = telefone;
    this.endereco = endereco;
    this.cep = cep;
    this.cidade = cidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Enum<EnumGenero> getGenero() {
    return genero;
  }

  public void setGenero(Enum<EnumGenero> genero) {
    this.genero = genero;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String toString(int dado) {
    return Integer.toString(dado);
  }
}
