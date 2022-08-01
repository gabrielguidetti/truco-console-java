package entities;

import java.util.ArrayList;
import java.util.List;

import enums.Duplas;

public class PartidaTruco {
	private List<Jogador> jogadores = new ArrayList<>();
	private Baralho baralho;
	private Placar placar;
	
	public PartidaTruco(Baralho baralho, Placar placar) {
		this.baralho = baralho;
		this.placar = placar;
		inicializarJogadores();
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}
	
	public Baralho getBaralho() {
		return baralho;
	}

	public Placar getPlacar() {
		return placar;
	}
	
	public boolean emPartida() {
		if(placar.getAzul() >= 12 || placar.getVermelho() >= 12){
			return false;
		}
		return true;
	}
	
	public void inicializarJogadores() {
		jogadores.add(new Jogador("Guidetti",Duplas.AZUL));
		jogadores.add(new Jogador("Leo",Duplas.AZUL));
		jogadores.add(new Jogador("Esteves",Duplas.VERMELHA));
		jogadores.add(new Jogador("Bia",Duplas.VERMELHA));
	}

}
