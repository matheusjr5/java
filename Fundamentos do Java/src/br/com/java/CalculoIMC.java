package br.com.java;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		// A linha abaixo cria vari�veis num�ricas de precis�o
		//float e double s�o tipos primitivos num�ricos
		double peso, altura, imc;
		Scanner teclado = new Scanner(System.in); 
		System.out.println("========C�lculo do IMC=======");
		System.out.print("Digite o peso em kg:");
		//entrada
		peso = teclado.nextDouble();
		System.out.println("digite a altura em metros");
		altura = teclado.nextDouble();
		//processamento
		imc = peso / (altura * altura);
		System.out.println(" IMC " + imc);
		
		
		
		

	}

}
