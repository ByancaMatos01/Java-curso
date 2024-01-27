package curso_java;

import java.util.Scanner;

/*
 * Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.
 */
public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		double pi=3.14, area;
		int raio;
		
		System.out.println("Digite o raio do circulo ");
		raio=leia.nextInt();
		area=(raio*raio)*pi;
		
		System.out.println("A area do circulo é "+ area);
		

	}

}
