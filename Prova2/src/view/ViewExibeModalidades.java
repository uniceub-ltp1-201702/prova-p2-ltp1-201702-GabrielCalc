package view;

import java.util.ArrayList;

import model.Esporte;

public class ViewExibeModalidades {

	public ViewExibeModalidades(ArrayList<Esporte> esportes) {

		for (int i = 0; i < esportes.size(); i++) {
			System.out.println("Modalidade: " + esportes.get(i).getModalidade());
		}
	}

}
