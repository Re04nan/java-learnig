package exercise;

import java.util.Scanner;

public class CalculoGastosFamiliar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double total = 0.0;
		
		System.out.print("Conta de luz = R$ ");
		total += scan.nextDouble();
		
		System.out.print("Conta de água = R$ ");
		total += scan.nextDouble();
		
		System.out.print("Conta de telefone = R$ ");
		total += scan.nextDouble();
		
		System.out.print("Escola do filho(a) = R$ ");
		total += scan.nextDouble();
		
		System.out.print("Fatura do cartão = R$ ");
		total += scan.nextDouble();
		
		System.out.print("Supermercado = R$ ");
		total += scan.nextDouble();
		
		System.out.println("Total = R$ " + total);
		
		scan.close();
	}

}
