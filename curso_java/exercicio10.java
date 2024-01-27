package curso_java;

import java.util.Scanner;

/*
 * .Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.
 */
public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		
		double F;
		int C;
		System.out.println("Digite a temperatura em Celsius");
		C=leia.nextInt();
		F=((C*1.8)+ 32);
		System.out.println("A temperatura em Fareheint é "+ F);
		
		
		
		
		
	}

}
