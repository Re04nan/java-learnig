package exercise;

import java.util.Scanner;

public class VerificaNota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double note = scan.nextDouble();
		Boolean student = note > 7.0;
				
		if(student) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		scan.close();
	}
}
