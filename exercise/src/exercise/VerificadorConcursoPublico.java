package exercise;

import java.util.Scanner;

public class VerificadorConcursoPublico {
	
	static final Integer NOTE_MAX_PORTUGUESE = 100;
	static final Integer NOTE_MAX_MATH = 100;
	static final Integer NOTE_MIN_APPROVED = 150;
	static final Integer NOTE_MIN_MATTER = 60;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Portugu�s = ");
		Integer pointsPortuguese = scan.nextInt();
		
		System.out.println("Matem�tica = ");
		Integer pointsMath = scan.nextInt();
		
		if(pointsMath < NOTE_MIN_MATTER || pointsPortuguese < NOTE_MIN_MATTER) {
			System.out.println("N�o foi dessa vez, sua nota foi abaixo do esperado em uma ou ambas mat�rias!");
		} else if (pointsMath + pointsPortuguese >= NOTE_MIN_APPROVED && 
				(pointsMath <= NOTE_MAX_MATH && pointsPortuguese <= NOTE_MAX_PORTUGUESE)) {
			System.out.println("Parab�ns voc� foi aprovado!");
		} else if (pointsMath > NOTE_MAX_MATH || pointsPortuguese > NOTE_MAX_PORTUGUESE) { 
			System.out.println("Error, verifique a nota digitada e tente novemente!");
		} else {
			System.out.println("N�o foi dessa vez, n�o atingiu a pontua��o necess�ria!");
		}
		
		scan.close();
	}
}
