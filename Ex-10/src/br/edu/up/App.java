package br.edu.up;

import br.edu.up.controller.SeguradoController;
import br.edu.up.controller.SeguroController;
import br.edu.up.controller.SeguroVeiculoController;
import br.edu.up.controller.SeguroVidaController;
import br.edu.up.model.lista.ListaSegurado;
import br.edu.up.model.lista.ListaSeguro;
import br.edu.up.model.modelo.*;
import br.edu.up.view.*;

public class App {
	public static ListaSegurado segurados = new ListaSegurado();
	public static ListaSeguro seguros = new ListaSeguro();

	public static void main(String[] args) throws Exception {
		int opcao;

		do {
			opcao = MenuView.principal();

			switch (opcao) {
				case 1:
					int opcaoSegurado;

					do {
						opcaoSegurado = MenuView.segurado();

						switch (opcaoSegurado) {
							case 1:
								SeguradoController.adicionar(segurados);

								break;

							case 2:
								int opcaoLocalizarSegurado;

								do {
									opcaoLocalizarSegurado = MenuView.localizarSegurados();

									switch (opcaoLocalizarSegurado) {
										case 1:
											String rgBuscado = SeguradoView.localizarRg();

											Segurado segurado = SeguradoController.localizarPorRg(segurados, rgBuscado);

											if (segurado == null) {
												SeguradoView.seguradoNaoLocalizado();

												break;
											}

											SeguradoView.visualizar(segurado);
											break;

										case 2:
											if (segurados.getListaSegurado().size() == 0) {
												ErroView.listaVazia();
												break;
											}

											SeguradoController.visualizarTodos(segurados);
											break;

										default:
											ErroView.opcaoInvalida();
											break;
									}
								} while (opcaoLocalizarSegurado != 0);
								break;

							case 3:
								String rgBuscado = SeguradoView.localizarRg();

								Segurado segurado = SeguradoController.localizarPorRg(segurados, rgBuscado);

								if (segurado == null) {
									SeguradoView.seguradoNaoLocalizado();

									break;
								}

								SeguradoController.excluir(segurados, rgBuscado);
								break;

							default:
								ErroView.opcaoInvalida();
								break;
						}
					} while (opcaoSegurado != 0);
					break;

				case 2:
					int opcaoSeguro;

					do {
						opcaoSeguro = MenuView.seguro();

						switch (opcaoSeguro) {
							case 1:
								int opcaoIncluirSeguro;

								do {
									opcaoIncluirSeguro = MenuView.incluirSeguro();

									switch (opcaoIncluirSeguro) {
										case 1:
											SeguroVida seguroVida = SeguroVidaView.adicionar(segurados);

											if (seguroVida != null) {
												SeguroVidaController.incluir(seguros, seguroVida);
											}

											break;

										case 2:
											SeguroVeiculo seguroVeiculo = SeguroVeiculoView.adicionar(segurados);

											if (seguroVeiculo != null) {
												SeguroVeiculoController.incluir(seguros, seguroVeiculo);
											}
											break;

										default:
											ErroView.opcaoInvalida();
											break;
									}
								} while (opcaoIncluirSeguro != 0);
								break;
							case 2:
								if (seguros.getListaSeguro().size() == 0) {
									ErroView.listaVazia();
									break;
								}

								String apolice = SeguroView.informeApolice();

								Seguro seguro = SeguroController.localizar(seguros, apolice);

								if(seguro == null) {
	    						SeguroView.seguroNaoEncontrado();

									break;
								}

								if (seguro.getClass() == SeguroVida.class) {
									SeguroVida seguroVida = (SeguroVida) seguro;
									SeguroVidaView.visualizar(seguroVida);
								}

								if (seguro.getClass() == SeguroVeiculo.class) {
									SeguroVeiculo seguroVeiculo = (SeguroVeiculo) seguro;
									SeguroVeiculoView.visualizar(seguroVeiculo);
								}

								break;
							case 3:
								if (seguros.getListaSeguro().size() == 0) {
									ErroView.listaVazia();

									break;
								}

								SeguroController.excluirTodos(seguros);
								break;
							case 4:
								if (seguros.getListaSeguro().size() == 0) {
									ErroView.listaVazia();

									break;
								}

								SeguroController.contarSeguros(seguros);

								break;

							default:
								ErroView.opcaoInvalida();
								break;
						}

					} while (opcaoSeguro != 0);
					break;

				default:
					ErroView.opcaoInvalida();
					break;
			}
		} while (opcao != 0);

	}
}
