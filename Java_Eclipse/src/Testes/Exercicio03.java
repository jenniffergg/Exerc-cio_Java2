package Testes;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner alfabeto = new Scanner (System.in);
		
		int A,B,soma;
		
		System.out.println("Informe um valor: ");
		A = alfabeto.nextInt();
		
		System.out.println("Informe um segundo valor: ");
		B = alfabeto.nextInt();
		
		soma = A+B;
		
		System.out.println("SOMA = " + soma);
}
	

}


/*https://www.urionlinejudge.com.br/judge/pt/problems/view/1003*/

