package exercise;

import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$");
		Double valueProduct = scan.nextDouble();
		
		System.out.print("Digite o valor pago pelo cliente: R$");
		Double valueReceived = scan.nextDouble();
		
		System.out.println("Valor produto: " + valueProduct);
		System.out.println("Valor recebido: " + valueReceived);
		System.out.printf("\nTroco: R$%.2f", 
				valueProduct > valueReceived?valueProduct - valueReceived : valueReceived - valueProduct);
		
		scan.close();
	}
	
}
