package exercise;

import java.util.Scanner;

public class TabuadaRecursiva {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		print("Digite um número para ser exibida a tabuada: ");
		Integer number = scan.nextInt();
		
		tableMultiplication(number);
		
		scan.close();
	}
	static void tableMultiplication(Integer value) {
		multiplication(value, 0);
	}
	static void multiplication(Integer value, Integer i) {
		print(value + " x " + i + " = " + (value*i) + "\n");
		
		if(++i <= 10) {
			multiplication(value, i);
		}
	}
	
	static void print(String text) {
		System.out.print(text);
	}

}
