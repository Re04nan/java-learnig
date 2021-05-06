package exercise;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o peso do lutador: ");
		Double weight = scan.nextDouble();
		
		Boolean smallWeight = (weight <= 60) && (weight > 30);
		Boolean averageWeight = (weight > 60) && (weight <= 90);
		Boolean heavyWeight = weight > 90;
		
		if (smallWeight) {
			System.out.println("O lutador foi selecionado para categoria peso pequeno!");			
		} else if (averageWeight) {
			System.out.println("O lutador foi selecionado para categoria peso médio!");
		} else if (heavyWeight) {
			System.out.println("O lutador foi selecionado para categoria peso pesado!");
		} else {
			System.out.println("O lutador não se encaixa em nenhuma categoria!");			
		}
		
//		if (smallWeight) {
//			System.out.println("O lutador foi selecionado para categoria peso pequeno!");
//		} else {
//			if (averageWeight) {
//				System.out.println("O lutador foi selecionado para categoria peso médio!");
//			} else {
//				if (heavyWeight) {
//					System.out.println("O lutador foi selecionado para categoria peso pesado!");
//				} else {
//					System.out.println("O lutador não se encaixa em nenhuma categoria!");
//				}
//			}
//		}
		
		scan.close();
	}

}
