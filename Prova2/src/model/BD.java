package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {

	private ArrayList<Medalha> medalhas;
	private ArrayList<Esporte> esportes;
	private String fileName = "medalhas.txt";
	private String fileNames = "esportes.txt";
	private DocumentWriter dw;
	private DocumentReader dr;

	// Metodo construtor

	public BD() {
		// instanciar os ArrayLists
		this.medalhas = new ArrayList<Medalha>();
		this.esportes = new ArrayList<Esporte>();
		// Instanciar o DocumentReader
		this.dr = new DocumentReader();
		// Instanciar o DocumentWriter
		this.dw = new DocumentWriter();

		ArrayList<String> linhas = dr.read(fileName);
		// Percorrer o ArrayList criando as medalhas
		for (int i = 0; i < linhas.size(); i++) {
			// Separa a linha do Array de String
			String[] linhaMedalha = linhas.get(i).split(";");
			// Cria a medalha com os dados da linha
			Medalha m = new Medalha(linhaMedalha[0], Integer.parseInt(linhaMedalha[1]),
					Integer.parseInt(linhaMedalha[1]), Integer.parseInt(linhaMedalha[2]),
					Integer.parseInt(linhaMedalha[4]));
			// Coloca a medalha no ArrayList
			this.medalhas.add(m);
		}

		ArrayList<String> linha = dr.read(fileNames);
		// Percorrer o ArrayList criando os esportes
		for (int i = 0; i < linha.size(); i++) {
			// Separa a linha do Array de String
			String[] linhaEsporte = linha.get(i).split(";");
			// Cria o esporte com os dados da linha
			Esporte e = new Esporte(linhaEsporte[0], linhaEsporte[1]); // Coloca
																		// o
																		// esporte
																		// no
																		// ArrayList
			this.esportes.add(e);
		}

	}

	public ArrayList<Medalha> getMedalhas() {
		return medalhas;
	}

	public ArrayList<Esporte> getEsportes() {
		return esportes;
	}

	// Retorna modalidade de acordo com esporte
	public String getModalidadePorNome(String esporte) {
		String retorno = "";

		// Percorrer a lista de usuarios
		for (int i = 0; i < this.esportes.size(); i++) {
			if (this.esportes.get(i).getEsporte().equals(esporte)) {
				retorno = this.esportes.get(i).getModalidade();
			}
		}

		return retorno;
	}

}
