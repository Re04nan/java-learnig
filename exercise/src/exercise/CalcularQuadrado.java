package exercise;

import java.util.Scanner;

public class CalcularQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer number = scan.nextInt();
		
		System.out.println(number * number);
		// ou System.out.printf("%.0f", Math.pow(number, 2));
		
		scan.close();
	}
}
