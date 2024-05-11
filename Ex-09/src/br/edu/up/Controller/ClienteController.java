package br.edu.up.Controller;

import br.edu.up.model.Cliente;
import br.edu.up.model.ClienteEmpresa;
import br.edu.up.model.ClientePessoa;
import br.edu.up.view.ClienteView;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private ClienteView view;
    private List<Cliente> clientes;

    public ClienteController() {
        view = new ClienteView();
        clientes = new ArrayList<>();
    }

    public void start() {
        boolean running = true;
        while (running) {
            int opcao = view.showMenu();
            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarParaClientePessoa();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    view.showMensagem("Opção inválida. Tente novamente.");
            }
        }
    }

    private void incluirClientePessoa() {
        String[] dados = view.cadastrarCliente();
        ClientePessoa clientePessoa = new ClientePessoa(dados[0], dados[1]);
        clientes.add(clientePessoa);
        view.showMensagem("Cliente pessoa incluído com sucesso.");
    }

    private void incluirClienteEmpresa() {
        String[] dados = view.cadastrarCliente();
        ClienteEmpresa clienteEmpresa = new ClienteEmpresa(dados[0], dados[1]);
        clientes.add(clienteEmpresa);
        view.showMensagem("Cliente empresa incluído com sucesso.");
    }

    private void mostrarDadosClientePessoa() {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa) {
                ClientePessoa clientePessoa = (ClientePessoa) cliente;
                view.mostrarDadosCliente(clientePessoa.getNome(), clientePessoa.getEndereco(), clientePessoa.getVlrEmprestado());
            }
        }
    }

    private void mostrarDadosClienteEmpresa() {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa) {
                ClienteEmpresa clienteEmpresa = (ClienteEmpresa) cliente;
                view.mostrarDadosCliente(clienteEmpresa.getNome(), clienteEmpresa.getEndereco(), clienteEmpresa.getVlrEmprestado());
            }
        }
    }

    private void emprestarParaClientePessoa() {
        double valor = view.getValorEmprestimo();
        view.showMensagem("Funcionalidade não implementada ainda.");
    }
}
