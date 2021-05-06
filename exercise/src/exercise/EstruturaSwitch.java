package exercise;

import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um mês do ano: ");
		Integer my = scan.nextInt();
		
		Double sale = 0.0;
		
		switch (my) {
		case 1 : sale = 10.0;
			break;
		case 2 : sale = 10.0;
			break;
		case 3 : sale = 15.0;
			break;
		case 4 : sale = 20.0;
			break;
		case 5 : sale = 10.0;
			break;
		case 6 : sale = 10.0;
			break;
		case 7 : sale = 0.0;
			break;
		case 8 : sale = 0.0;
			break;
		case 9 : sale = 0.0;
			break;
		case 10 : sale = 10.0;
			break;
		case 11 : sale = 15.0;
			break;
		case 12 : sale = 25.0;
			break;
		default: System.err.print("Mês inválido!");
				 System.exit(1);
			break;
		}
		
		System.out.print("O desconto no mês " + my + " é de " + sale + "%.");
		
		scan.close();
	}

}
