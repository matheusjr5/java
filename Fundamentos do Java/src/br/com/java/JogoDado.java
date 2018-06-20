package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		char opcao;
		Scanner teclado = new Scanner(System.in);
		do {
			//a linha abaico usa a classe Random para criar um objeto que ser� usado para gerar n�meros aleat�rios
			Random dado = new Random();
			int face = dado.nextInt(6) + 1; //gerar n�meros aleat�rios (0 a 5) //somamos 1 ao resultado pois n�o existe face 0 no dado
			System.out.println("Face do dado: " + face);
			System.out.println("Deseja Jogar novamente(s/n)?");
			opcao = teclado.next().charAt(0);
		} while (opcao == 's');

	}

}
