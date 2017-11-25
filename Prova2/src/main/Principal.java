package main;

import control.ControlePesquisaEsporte;
import model.BD;

public class Principal {

	public static void main(String[] args) {
		// Gabriel Gago Duro Calcagno RA:21708493
		BD bds = new BD();
		//ControlePesquisaEsporte cpe = new ControlePesquisaEsporte(bds);
		//cpe.exibirEsportes();
		
		System.out.println(bds.getModalidadePorNome("boxe"));

	}

}
