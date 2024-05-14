package br.edu.up;

import br.edu.up.controller.AeronoveController;
import br.edu.up.controller.PassageiroController;
import br.edu.up.model.Listas.ListaAeronaves;
import br.edu.up.model.Listas.ListaComandantes;
import br.edu.up.model.Listas.ListaPassageiros;
import br.edu.up.model.Listas.ListaPassagens;
import br.edu.up.model.Listas.ListaTripulantes;
import br.edu.up.model.Modelos.Aeronave;
import br.edu.up.model.Modelos.Comandante;
import br.edu.up.model.Modelos.Passageiro;
import br.edu.up.model.Modelos.Passagem;
import br.edu.up.model.Modelos.Tripulacao;
import br.edu.up.view.AeronaveView;
import br.edu.up.view.ComandanteView;
import br.edu.up.view.Menu;
import br.edu.up.view.PassageiroView;
import br.edu.up.view.PassagemView;
import br.edu.up.view.TripulanteView;
import br.edu.up.view.OpcaoInvalida;

public class App {
	public static ListaPassageiros passageiros = new ListaPassageiros();
	public static ListaPassagens passagens = new ListaPassagens();
	public static ListaTripulantes tripulantes = new ListaTripulantes();
	public static ListaComandantes comandantes = new ListaComandantes();
	public static ListaAeronaves aeronaves = new ListaAeronaves();

	public static PassageiroController trafegoController = new PassageiroController();

	public static void main(String[] args) throws Exception {
		int opcao;

		do {
			opcao = Menu.principal();

			switch (opcao) {

				case 1:
					int opcaoRegistrar;

					do {
						opcaoRegistrar = Menu.registrar();

						switch (opcaoRegistrar) {
							case 1:
								Tripulacao tripulante = TripulanteView.criarTripulante();

								TripulanteView.tripulanteAddSucesso(tripulante);
								tripulantes.adicionarTripulante(tripulante);

								break;

							case 2:
								Passagem passagem = PassagemView.criarPassagem();

								passagens.adicionarPassagem(passagem);
								PassagemView.passagemAddSucesso(passagem);

								break;

							case 3:
								Passageiro passageiro = PassageiroView.criarPassageiro();

								if (passageiro != null) {
									passageiros.adicionarPassageiro(passageiro);
									PassageiroView.passageiroAddSucesso(passageiro, passageiro.getPassagem().getId());

									break;
								}

								break;

							case 4:
								Comandante comandante = ComandanteView.criarComandante();
								
								comandantes.adicionarComandante(comandante);
								ComandanteView.comandanteAddSucesso(comandante);

								break;

							case 5:
								Aeronave aeronave = AeronaveView.criAeronave();

								if(aeronave == null) {
									break;
								}

								aeronaves.adicionarAeronave(aeronave);
								AeronaveView.aeronaveAddSucesso(aeronave);

								break;

							case 0:
								break;

							default:
								OpcaoInvalida.opcaoInvalida();
								break;
						}
					} while (opcaoRegistrar != 0);
					break;

				case 2:
					int opcaoVisualizar;

					do {
						opcaoVisualizar = Menu.visualizar();

						switch (opcaoVisualizar) {
							case 1:
								if (tripulantes.getTripulantes().size() == 0) {
									PassageiroView.mostrarMensagemSemPassageiros();

									break;
								}

								TripulanteView.visualizarTriuplantesMenu();

								for (Tripulacao tripulacao : tripulantes) {
									TripulanteView.visualizarTripulantes(tripulacao);
								}

								break;

							case 2:
								if (passagens.getPassagens().size() == 0) {
									PassagemView.mostrarMensagemSemPassagem();

									break;
								}

								PassagemView.visualizarPassagemMenu();

								for (Passagem passagem : passagens) {
									PassagemView.visualizarPassagens(passagem);
								}

								break;

							case 3:
								if (passageiros.getPassageiros().size() == 0) {
									PassageiroView.mostrarMensagemSemPassageiros();

									break;
								}

								PassageiroView.visualizarPassageirosMenu();
								for (Passageiro passageiro : passageiros) {
									PassageiroView.visualizarPassageiros(passageiro, passageiro.getPassagem());
								}

								break;

							case 4:
								if (comandantes.getComandantes().size() == 0) {
									ComandanteView.mostrarMensagemSemComandantes();

									break;
								}

								ComandanteView.visualizarComandantesMenu();

								for (Comandante comandante : comandantes) {
									ComandanteView.visualizarComandantes(comandante);
								}

								break;

							case 5:
								if (aeronaves.getAeronaves().size() == 0) {
									AeronaveView.mostrarMensagemSemAeronave();

									break;
								}

								AeronaveView.visualizarAeronavesMenu();
								for (Aeronave aeronave : aeronaves) {
									AeronaveView.visualizarAeronaves(aeronave);
								}

								break;

							case 0:
								break;

							default:
								OpcaoInvalida.opcaoInvalida();
								break;
						}
					} while (opcaoVisualizar != 0);
					break;

				case 3:
					int opcaoAeronave;
					do {
						opcaoAeronave = Menu.aeronave();

						switch (opcaoAeronave) {
							case 1:
								String codigoVoo = AeronaveView.informarAeronave();
								String matriculaTripulante = AeronaveView.informarTripulante();

								if (matriculaTripulante == null) {
									break;
								}

								if (codigoVoo == null) {
									break;
								}

								AeronoveController.addTripulanteAeronave(codigoVoo, matriculaTripulante);
								break;

							case 2:
								codigoVoo = AeronaveView.informarAeronave();
								String rgPassageiro = AeronaveView.informarPassageiro();

								if (rgPassageiro == null) {
									break;
								}

								if (codigoVoo == null) {
									break;
								}

								AeronoveController.addPassageiroAeronave(codigoVoo, rgPassageiro);
								break;
						}
					} while (opcaoAeronave != 0);
					break;

				case 0:
					break;

				default:
					OpcaoInvalida.opcaoInvalida();
					break;
			}

		} while (opcao != 0);
	}
}
