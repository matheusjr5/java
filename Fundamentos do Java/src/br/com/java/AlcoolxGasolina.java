package br.com.java;

import java.util.Scanner;

public class AlcoolxGasolina {

	public static void main(String[] args) {
		double gasolina;
		double alcool;
		//ENTRADA
		Scanner teclado = new Scanner(System.in);
		System.out.println("=========================");
		System.out.print(" Digite o valor do �lcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		System.out.println("=============================");
		//PROCESSAMENTO
	   if (alcool <= (gasolina * 0.7)) {
			System.out.println("ABASTE�A COM �LCOOL");
		} else {
        System.out.println("ABASTE�A COM GASOLINA");
		}
		
		
		
				

	}

}
