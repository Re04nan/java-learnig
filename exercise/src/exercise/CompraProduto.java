package exercise;

import java.util.Scanner;

public class CompraProduto {
	static final Double FREIGHT = 15.00;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor total do produto: R$");
		Double productValue = scan.nextDouble();
		
		if(productValue>= 100) {
			System.out.println("Total = R$ " + productValue);
		} else {
			System.out.println("Total = R$ " + (productValue + FREIGHT));
		}
		
		scan.close();
	}

}
