
package control;

import java.util.ArrayList;

import model.BD;
import model.Esporte;
import view.ViewExibeModalidades;
import view.ViewSolicitaModalidade;

public class ControlePesquisaEsporte {
	// Atributos
	private BD bds;

	public ControlePesquisaEsporte(BD bds) {
		// Guardar o BDSimulado
		this.bds = bds;
	}

	// Metodo para pesquisar esporte

	// Metodo que exibe todas as modalidades
	public void exibirEsportes() {
		// Criar a view para solicitar o esporte
		ViewSolicitaModalidade vsm = new ViewSolicitaModalidade();

		// Recuperando o esporte digitado pelo usario
		String esporte = vsm.getModalidade();

		// Recuperar todas as modalidades
		ArrayList<Esporte> esportes = this.bds.getEsportes();

		// Exibir todas as modalidades
		ViewExibeModalidades vem = new ViewExibeModalidades(esportes);

	}
}
