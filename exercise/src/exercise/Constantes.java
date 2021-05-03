package exercise;

import java.util.Scanner;

public class Constantes {
	static final Integer AGE_MIN_DRIVE = 18;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua Idade:");
		Integer age = scan.nextInt();
		
		Boolean verify = age >= AGE_MIN_DRIVE;
		
		if(verify) {
			System.out.println("Pode tirar a carteira!");
		} else {
			System.out.println("Não tem idade para tirar a carteira!");
		}
		
		scan.close();
	}

}
