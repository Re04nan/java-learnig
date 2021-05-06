package exercise;

import java.util.Scanner;

public class DiaSemanaSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		Integer day = scan.nextInt();
		
		String week = "";
		
		switch (day) {
		case 1: week = "Domingo";
			break;
		case 2: week = "Segunda-feira";
			break;
		case 3: week = "Ter�a-feira";
			break;
		case 4: week = "Quarta-feira";
			break;
		case 5: week = "Quinta-feira";
			break;
		case 6: week = "Sexta-feira";
			break;
		case 7: week = "S�bado";
			break;
		default: System.err.print("Dia inv�lido!");
				 System.exit(1);
			break;
		}
		
		System.out.println("Dia " + day + " vai ser " + week + "!");
		
		scan.close();
	}

}
