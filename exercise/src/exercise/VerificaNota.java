package exercise;

import java.util.Scanner;

public class VerificaNota {
	static final Double VALUE_NOTE = 7.0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double note = scan.nextDouble();
		Boolean student = note > VALUE_NOTE;
				
		if(student) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		scan.close();
	}
}
