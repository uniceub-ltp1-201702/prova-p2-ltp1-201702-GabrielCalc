package view;

import javax.swing.JOptionPane;

public class ViewSolicitaModalidade {

	private String modalidade;

	public ViewSolicitaModalidade() {
		this.modalidade = JOptionPane.showInputDialog("Digite o esporte:");
	}

	public String getModalidade() {
		return modalidade;
	}

}
