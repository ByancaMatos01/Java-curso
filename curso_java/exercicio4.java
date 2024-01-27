package curso_java;

import java.util.Scanner;
/*
 * . Faça um Programa que peça as 4 notas bimestrais e mostre a média
 */
public class exercicio4 {

	public static void main(String[] args) {
		double nota1, nota2,nota3,nota4;
		
		 Scanner leia=new Scanner(System.in);
		 
		 System.out.println("Digite a primeira nota ");
		 nota1=leia.nextDouble();
		 
		 System.out.println("Digite a segunda nota ");
		 nota2=leia.nextDouble();
		 
		 System.out.println("Digite a terceira nota ");
		 nota3=leia.nextDouble();
		 
		 System.out.println("Digite a quarta nota ");
		 nota4=leia.nextDouble();
		 
		 double med=(nota1+nota2+nota3+nota4)/4;
		 
		 System.out.println("A media das notas é "+ med);
		

	}

}
