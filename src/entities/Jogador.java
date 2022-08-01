package entities;

import java.util.ArrayList;
import java.util.List;

import enums.Duplas;

public class Jogador {
	
	private List<Carta> mao = new ArrayList<>();
	private Duplas dupla;
	private String nome;
	
	public Jogador(String nome, Duplas dupla) {
		this.dupla = dupla;
		this.nome = nome;
	}

	public List<Carta> getMao(){
		return mao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Duplas getDupla() {
		return dupla;
	}
}
