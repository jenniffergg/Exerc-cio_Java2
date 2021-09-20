package Testes;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int ano, mes, dia, mesi, diai;
		int anoi, cadu;

		ano = 365;
		mes = 30;
		dia = 1;
		System.out.println("Informe sua idade em dias: ");
		dia = leia.nextInt();

		anoi = dia / ano;
		mesi = (dia % ano)/mes;
		diai = (dia % ano) % mes;
		
		System.out.println(anoi + " Ano (s)");
		System.out.println(mesi + " Mês (es)");
		System.out.println(diai + " Dia (s)" );

	}

}
