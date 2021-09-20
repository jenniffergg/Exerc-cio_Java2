package Testes;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
	
	int letraA = 0, letraB, letraC;
	
	letraC = 10;
	letraB = 20;
	
	
	letraC = letraA;
	letraA = letraB;
	letraB = letraC;
	
	System.out.println("O valor que estava em B era: "+ letraA +  "\nO valor que estava em B era: "+ letraB);
	
}

}	