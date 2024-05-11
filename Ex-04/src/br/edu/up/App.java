package br.edu.up;

import java.util.ArrayList;
import br.edu.up.controller.EstacionamentoController;
import br.edu.up.model.Estacionamento;
import br.edu.up.model.Veiculo;
import br.edu.up.view.View;

public class App {
	public static void main(String[] args) throws Exception {
		View view = new View();

		Estacionamento estacionamento = new Estacionamento();
		ArrayList<Veiculo> vagas = estacionamento.getVagas();
		ArrayList<Veiculo> relatorio = estacionamento.getRelatorio();
		EstacionamentoController estController = new EstacionamentoController();

		int option = view.menuEstacionamento();

		while (option != 0) {
			switch (option) {
				case 1:
					Veiculo veiculo = view.menuRegistroDeCarro();
					Veiculo veiculoEstacionado = estController.buscarCarro(vagas, veiculo.getPlaca());

					if (veiculoEstacionado == null) {
						vagas.add(veiculo);
						relatorio.add(veiculo);
						view.veiculoCadastrado();
					} else {
						view.veiculoEstacionado();
					}

					option = view.menuEstacionamento();
					break;

				case 2:
					String placa = view.retirarCarro();
					Veiculo veiculoRemovido = estController.removerCarro(vagas, placa);

					if (veiculoRemovido == null) {
						view.veiculoIndisponivel();
					} else {
						view.veiculoRetirado();
					}

					option = view.menuEstacionamento();
					break;

				case 3:
					if (vagas.size() == 0) {
						view.estacionamentoVazio();
					} else {
						view.mostrarEstacionados(vagas);
					}

					option = view.menuEstacionamento();
					break;

				case 4:
					if (relatorio.size() == 0) {
						view.relatorioVazio();
					} else {
						estController.emitirRelatorio(relatorio, estacionamento);
					}
					option = view.menuEstacionamento();
					break;

				default:
					System.out.println("\nOpção Inválida");
					option = view.menuEstacionamento();
					break;
			}
		}
	}
}
