package exercise;

import java.util.Scanner;

public class IndiceDeMassaCorporal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---- IMC ----");
		System.out.print("Digite sua altura: ");
		Double height = scan.nextDouble();
		
		System.out.print("Digite o seu peso: ");
		Double weight = scan.nextDouble();
		
		System.out.printf("\nAltura: %.2fm", height);
		System.out.printf("\nPeso: %.2fKg", weight);
		System.out.printf("\nSeu IMC = %.2f", weight / (height * height));
		
		scan.close();
	}

}
