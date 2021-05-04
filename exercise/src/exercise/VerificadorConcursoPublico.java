package exercise;

import java.util.Scanner;

public class VerificadorConcursoPublico {
	
	static final Integer NOTE_MAX_PORTUGUESE = 100;
	static final Integer NOTE_MAX_MATH = 100;
	static final Integer NOTE_MIN_APPROVED = 150;
	static final Integer NOTE_MIN_MATTER = 60;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Português = ");
		Integer pointsPortuguese = scan.nextInt();
		
		System.out.println("Matemática = ");
		Integer pointsMath = scan.nextInt();
		
		if(pointsMath < NOTE_MIN_MATTER || pointsPortuguese < NOTE_MIN_MATTER) {
			System.out.println("Não foi dessa vez, sua nota foi abaixo do esperado em uma ou ambas matérias!");
		} else if (pointsMath + pointsPortuguese >= NOTE_MIN_APPROVED && 
				(pointsMath <= NOTE_MAX_MATH && pointsPortuguese <= NOTE_MAX_PORTUGUESE)) {
			System.out.println("Parabéns você foi aprovado!");
		} else if (pointsMath > NOTE_MAX_MATH || pointsPortuguese > NOTE_MAX_PORTUGUESE) { 
			System.out.println("Error, verifique a nota digitada e tente novemente!");
		} else {
			System.out.println("Não foi dessa vez, não atingiu a pontuação necessária!");
		}
		
		scan.close();
	}
}
