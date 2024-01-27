package curso_java;

import java.util.Scanner;

/*
 * Faça um Programa que converta metros para centímetros.
 */
public class exercicio5 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);

		int cent, met;

		System.out.println("Digite os metros: ");
		met=leia.nextInt();

		cent=met*100;
		System.out.println("A conversão de metros para centímetros é "+ cent+ "cm");

	}

}
