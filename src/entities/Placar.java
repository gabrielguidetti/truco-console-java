package entities;

import enums.Duplas;

public class Placar {
	private int azul;
	private int vermelho;
	
	public Placar() {
		azul = 0;
		vermelho = 0;
	}
	
	public void aumentarPonto(Duplas dupla, int qtd) {
		if(dupla == Duplas.AZUL) {
			azul += qtd;
		} else {
			vermelho += qtd;
		}
	}
	
	@Override
	public String toString() {
		return "Azul: "+azul+"\n"+
			   "Vermelho: "+vermelho;
	}
	
}
