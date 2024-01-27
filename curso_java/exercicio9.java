package curso_java;

import java.util.Scanner;

/*
 * Faça um Programa que peça a temperatura em graus Farenheit,
   transforme e mostre a temperatura em graus Celsius.
    C = (5 * (F-32) / 9).
 */
public class exercicio9 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int F, C;
		System.out.println("Digite a temperatura em Fareheit");
		F=leia.nextInt();
		C=(5*(F-32)/9);
		System.out.println("A temperatura em Celsius é "+ C);
		

	}

}
