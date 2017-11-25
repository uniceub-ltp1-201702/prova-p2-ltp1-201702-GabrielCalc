package model;

public class Esporte {

	private String esporte;
	private String modalidade;

	public Esporte(String esporte, String modalidade) {
		super();
		this.esporte = esporte;
		this.modalidade = modalidade;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	@Override
	public String toString() {
		return "Esporte [esporte=" + esporte + ", modalidade=" + modalidade + "]";
	}

	// Metodo que transforma um esporte na representação dele em linha para
	// salvar um arquivo
	public String toLinha() {
		return getEsporte() + ";" + getModalidade();
	}

}
