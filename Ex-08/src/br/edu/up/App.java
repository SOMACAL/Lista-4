package br.edu.up;

import br.edu.up.controller.*;
import br.edu.up.model.listas.*;
import br.edu.up.model.modelos.*;
import br.edu.up.view.*;

public class App {
	public static PessoalLista listaPessoal = new PessoalLista();
	public static ComercialLista listaComercial = new ComercialLista();
	public static PessoalController pessoalController = new PessoalController();
	public static ComercialController comercialController = new ComercialController();

	public static void main(String[] args) throws Exception {
		int opcao;
		do {
			opcao = Menu.principal();

			switch (opcao) {
				case 1:
					int opcaoAdicionar;

					do {
						opcaoAdicionar = Menu.adicionar();

						switch (opcaoAdicionar) {
							case 1:
								Pessoal pessoal = PessoalView.adicionar();

								PessoalController.adicionarPessoal(listaPessoal, pessoal);
								break;

							case 2:
								Comercial comercial = ComercialView.adicionar();

								ComercialController.adicionarComercial(listaComercial, comercial);
								break;

							default:
								break;
						}

					} while (opcaoAdicionar != 0);
					break;

				case 2:
					int codigoContato = ContatoView.codigo();

					Contato contatoBuscado = PessoalController.buscarPessoal(listaPessoal, codigoContato);

					if (contatoBuscado == null) {
						ContatoView.contatoRemovidoFalha(codigoContato);
						break;
					}

					if (contatoBuscado.getClass() == Pessoal.class) {
						PessoalController.removerPessoal(listaPessoal, codigoContato);
					} else {
						ComercialController.removerPessoal(listaComercial, codigoContato);

					}
					break;

				case 3:
					int opcaoMostrar;

					do {
						opcaoMostrar = Menu.mostrar();

						switch (opcaoMostrar) {
							case 1:
								int opcaoMostrarTodos;

								do {
									opcaoMostrarTodos = Menu.subMenuMostrarTodos();

									switch (opcaoMostrarTodos) {
										case 1:
											if (listaPessoal.getContatosPessoais().size() == 0
													&& listaComercial.getContatosComerciais().size() == 0) {
												ErrosView.listaVazia();

												break;
											}

											if (listaPessoal.getContatosPessoais().size() == 0) {
												ComercialController.mostrarListaComercial(listaComercial);

												break;
											}

											if (listaComercial.getContatosComerciais().size() == 0) {
												PessoalController.mostrarListaPessoal(listaPessoal);

												break;
											}

											ComercialController.mostrarListaComercial(listaComercial);
											PessoalController.mostrarListaPessoal(listaPessoal);

											break;

										case 2:
											if (listaPessoal.getContatosPessoais().size() == 0) {
												ErrosView.listaVazia();
												break;
											}

											PessoalController.mostrarListaPessoal(listaPessoal);

											break;

										case 3:
											if (listaComercial.getContatosComerciais().size() == 0) {
												ErrosView.listaVazia();
												break;
											}

											ComercialController.mostrarListaComercial(listaComercial);

											break;

										default:
											break;
									}
								} while (opcaoMostrarTodos != 0);
								break;

							case 2:
								codigoContato = ContatoView.codigo();

								contatoBuscado = PessoalController.buscarPessoal(listaPessoal, codigoContato);

								if (contatoBuscado == null) {
									contatoBuscado = ComercialController.buscarComercial(listaComercial, codigoContato);
								}

								if (contatoBuscado == null) {
									ContatoView.contatoNaoEncontrado(codigoContato);
									break;
								}

								if (contatoBuscado.getClass() == Pessoal.class) {
									Pessoal contatoBuscadoPessoal = PessoalController.buscarPessoal(listaPessoal, codigoContato);

									PessoalView.visualizar(contatoBuscadoPessoal);

									break;
								} else {
									Comercial contatoBuscadoComercial = ComercialController.buscarComercial(listaComercial,
											codigoContato);

									ComercialView.visualizar(contatoBuscadoComercial);
								}
								break;

							default:
								break;
						}
					} while (opcaoMostrar != 0);

				default:
					break;
			}
		} while (opcao != 0);
	}
}
