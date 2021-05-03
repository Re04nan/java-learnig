package exercise;

import java.util.Scanner;

public class CalculadoraSimples {
	
	static final String SUM = "+";
	static final String SUBTRACTION = "-";
	static final String MULTIPLICATION = "x";
	static final String DIVISION = "/";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o 1° valor: ");
		Integer numberOne = scan.nextInt();
		
		System.out.println("Digite a operação desejada:\n [+][-][x][/]");
		String operation = scan.next();
		
		System.out.print("Digite o 2° valor: ");
		Integer numberTwo = scan.nextInt();
		
		if(operation.equals(SUM)) {
			System.out.print("Resultado = "+ (numberOne + numberTwo));
		} else if (operation.equals(SUBTRACTION)) {
			System.out.print("Resultado = "+ (numberOne - numberTwo));
		} else if (operation.equals(MULTIPLICATION)) {
			System.out.print("Resultado = "+ (numberOne * numberTwo));
		} else if (operation.equals(DIVISION)) {
			System.out.print("Resultado = "+ (numberOne / numberTwo));
		} else {
			System.out.print("Erro, operação não reconhecida!");
		}
		
		scan.close();
	}

}
