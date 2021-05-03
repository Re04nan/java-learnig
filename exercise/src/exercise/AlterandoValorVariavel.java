package exercise;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$");
		Double productPrice = scan.nextDouble() ;
		
		System.out.println("Qual será a forma de pagamento? [Débito = 1] | [Crédito = 2]");
		Integer payment = scan.nextInt();
		
		Boolean verify = payment.equals(1);
		Double fees = 0.0;
		if(!verify) {
			fees = 10.0;
		}
		Double totalFees = (productPrice * fees) / 100;
		Double total = productPrice + totalFees;
		System.out.println("Valor total para pagamento = R$" + total);
		
		scan.close();
	}

}
