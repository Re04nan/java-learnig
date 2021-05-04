package exercise;

import java.util.Scanner;

public class VerificadorTempoContribuicao {
	static final Integer AGE_MIN_RETIRE = 55;
	static final Integer TIME_MIN_TRIBUTE = 25;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Idade: ");
		Integer age = scan.nextInt();
		
		System.out.print("Tempo de contribuição: ");
		Integer timeTribute = scan.nextInt();
		
		Boolean verify = age >= AGE_MIN_RETIRE && timeTribute >= TIME_MIN_TRIBUTE;
		
		if(verify) {
			System.out.println("Pode se aposentar!");
		} else {
			System.out.println("Não pode se aposentar!");
		}
		
		scan.close();
	}

}
