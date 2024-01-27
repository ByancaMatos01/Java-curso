package curso_java;

import java.util.Scanner;

/*
 * Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês
 */
public class exercicio8 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		double horas, numeroHoras;
		
		System.out.println("Quanto você ganha por hora ? ");
		horas=leia.nextDouble();
		
		System.out.println("Qual é o seu  numero de horas trabalhada no mes:");
		numeroHoras=leia.nextDouble();
		
		double total=horas*numeroHoras;
		
		System.out.println("O seu tota é " + total);
	

	}

}
