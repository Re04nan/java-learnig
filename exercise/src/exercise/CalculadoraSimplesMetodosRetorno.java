package exercise;

import java.util.Scanner;

public class CalculadoraSimplesMetodosRetorno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		print("Digite o primeiro valor: ");
		Double numberOne = scan.nextDouble();
		
		print("Digite o segundo valor: ");
		Double numberTwo = scan.nextDouble();

		print("Digite qual operação deseja fazer: [+][-][x][/] -> ");
		String operation = scan.next();
		
		if(operation.equals("+")) {
			print("Resultado = " + sum(numberOne, numberTwo));
		} else if (operation.equals("-")) {
			print("Resultado = " + subtraction(numberOne, numberTwo));
		} else if (operation.equals("x")) {
			print("Resultado = " + multiplication(numberOne, numberTwo));
		} else if (operation.equals("/")) {
			print("Resultado = " + division(numberOne, numberTwo));
		} else {
			System.err.print("Erro, operação inválida!");
			System.exit(1);
		}
		
		scan.close();
	}
	
	static Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}
	static Double subtraction(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
	static Double multiplication(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}
	static Double division(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}	
	static void print(String text) {
		System.out.print(text);
	}

}
