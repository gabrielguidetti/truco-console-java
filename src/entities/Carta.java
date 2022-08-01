package entities;

import enums.Naipes;

public class Carta {
	private String numero;
	private Naipes naipe;
	
	public Carta(String numero, Naipes naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}

	public String getNumero() {
		return numero;
	}

	public Naipes getNaipe() {
		return naipe;
	}
	
	@Override
	public String toString() {
		return numero+" "+naipe.toString();
	}
}
