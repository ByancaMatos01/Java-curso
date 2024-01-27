package curso_java;

import java.util.Scanner;

/*
 * . Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.
 */
public class exercicio7 {

	public static void main(String[] args) {
		
	Scanner leia= new Scanner(System.in);
	
	double lado, area;
	
	System.out.println("Digite o lado do quadrado ");
	lado=leia.nextDouble();
	
	area=lado*lado;
	
	System.out.println("A area do quadrado é "+ area);
	
	System.out.println(" E o seu dobro é "+ area*2);
	
	
	

	}

}
