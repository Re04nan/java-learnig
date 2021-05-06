package exercise;

import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] menuPizza = new String[5];
		for (int i = 0; i < menuPizza.length; i++) {
			System.out.print("Adicione sabores de pizza: ");
			menuPizza[i] = scan.nextLine();
		}
		
		System.out.println("\nCardápio:\n");
		for (int j = 0; j < menuPizza.length; j++) {
			System.out.println("[" + j + "] " + menuPizza[j]);
		}
		
		System.out.print("\nEscolha o sabor: ");
		Integer option = scan.nextInt();
		
		System.out.println("O sabor escolhido foi pizza de " + menuPizza[option]);
		
		scan.close();
	}

}
