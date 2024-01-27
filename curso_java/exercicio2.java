package curso_java;

import java.util.Scanner;

/*
 * Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].
 */
public class exercicio2 {
	public static void main(String[] args) {
   int num;
   Scanner leia=new Scanner(System.in);
     
   num=leia.nextInt();
   System.out.println("O numero informado foi "+ num);
	}
}
