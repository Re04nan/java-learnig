package exercise;

import java.util.Scanner;

public class AlterandoValorVariavel2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$");
		Double productPrice = scan.nextDouble();
		
		System.out.print("Digite a quantidade desejada:");
		Integer quantity = scan.nextInt();
		
		Double rebate = 0.0;
		if(quantity > 10) {
			rebate = 10.0;
		}
		Double totalRebate = (productPrice * quantity * rebate)/ 100;
		Double total = (productPrice * quantity) - totalRebate;
		System.out.println("Total da compra = R$" + total);
		scan.close();
	}

}
