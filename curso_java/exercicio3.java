package curso_java;
import java.util.Scanner;
/*
 *  Faça um Programa que peça dois números e imprima a soma
 */
public class exercicio3 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner leia= new Scanner(System.in);
        
		System.out.println("Digite um número ");
		num1=leia.nextInt();
		
		System.out.println("Digite o segundo Número ");
		num2=leia.nextInt();
		
		int med=(num1+num2)/2;
		
		System.out.println("A media dos núemros é "+ med);
	}
}
