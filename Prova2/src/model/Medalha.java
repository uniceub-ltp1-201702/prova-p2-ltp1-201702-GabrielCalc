package model;

public class Medalha {
	private String pais;
	private int medOuro;
	private int medPrata;
	private int medBronze;
	private int posicaoNoRanking;

	public Medalha(String pais, int medOuro, int medPrata, int medBronze, int posicaoNoRanking) {
		super();
		this.pais = pais;
		this.medOuro = medOuro;
		this.medPrata = medPrata;
		this.medBronze = medBronze;
		this.posicaoNoRanking = posicaoNoRanking;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getMedOuro() {
		return medOuro;
	}

	public void setMedOuro(int medOuro) {
		this.medOuro = medOuro;
	}

	public int getMedPrata() {
		return medPrata;
	}

	public void setMedPrata(int medPrata) {
		this.medPrata = medPrata;
	}

	public int getMedBronze() {
		return medBronze;
	}

	public void setMedBronze(int medBronze) {
		this.medBronze = medBronze;
	}

	public int getPosicaoNoRanking() {
		return posicaoNoRanking;
	}

	public void setPosicaoNoRanking(int posicaoNoRanking) {
		this.posicaoNoRanking = posicaoNoRanking;
	}

	@Override
	public String toString() {
		return "Medalha [pais=" + pais + ", medOuro=" + medOuro + ", medPrata=" + medPrata + ", medBronze=" + medBronze
				+ ", posicaoNoRanking=" + posicaoNoRanking + "]";
	}

	// Metodo que transforma uma medalha na representação dela em linha para
	// salvar um arquivo
	public String toLinha() {
		return getPais() + ";" + getMedOuro() + ";" + getMedPrata() + ";" + getMedBronze() + ";"
				+ getPosicaoNoRanking();
	}

}
