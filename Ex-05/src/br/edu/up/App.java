package br.edu.up;

import br.edu.up.Controller.EventoController;
import br.edu.up.view.EventoReservaView;

public class App {
    public static void main(String[] args) {
        EventoController controller = new EventoController();
        
        EventoReservaView view = new EventoReservaView(controller);
        
        view.exibirMenu();
    }
}
