package application;

import java.util.Scanner;

import entities.Baralho;
import entities.Carta;
import entities.PartidaTruco;
import entities.Placar;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Baralho baralho = new Baralho();
		Placar placar = new Placar();

		PartidaTruco partida = new PartidaTruco(baralho, placar);
		Carta[] cartasNaMesa = new Carta[5];

		UI.clearScreen();
		UI.printarPartida(partida, cartasNaMesa);

	}

}
