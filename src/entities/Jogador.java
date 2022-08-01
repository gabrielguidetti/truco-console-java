package entities;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	
	private List<Carta> mao = new ArrayList<>();
	private String nome;
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	public List<Carta> getMao(){
		return mao;
	}
}
