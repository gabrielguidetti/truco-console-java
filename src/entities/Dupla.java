package entities;

import java.util.ArrayList;
import java.util.List;

import enums.Duplas;

public class Dupla {
	
	private List<Jogador> jogadores = new ArrayList<>();
	private Duplas dupla;
	
	public Dupla(Duplas dupla) {
		this.dupla = dupla;
	}
	
	public void escalarDuplas(Jogador j1, Jogador j2) {
		jogadores.add(j1);
		jogadores.add(j2);
	}
	
	
}
