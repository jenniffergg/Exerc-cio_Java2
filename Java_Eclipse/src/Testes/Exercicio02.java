package Testes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int N, cont;
		Scanner escreva = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		N = escreva.nextInt();

		for (cont = 1; cont < 10000; cont++) {

			if (cont % N == 2) {
				System.out.println(cont);
			}
		}
	}
}


/*https://www.urionlinejudge.com.br/judge/pt/problems/view/1075*/