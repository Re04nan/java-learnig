package exercise;

import java.util.Scanner;

public class AplicandoMetodos {
	// main método especial do java
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] bookStore = new String[] {
				"Java", "C Sharp", "JavaScript", "Paython", "Golang"
		};
		// invocando o método
		lines();
		for(int i = 0; i < bookStore.length; i++) {
			System.out.println((i+1) + " - " + bookStore[i]);
		}
		lines();
		System.out.print("Escolha o livro: ");
		Integer takeBook = scan.nextInt();
		
		Boolean verifyTakeBook = (takeBook > 0) && (takeBook <= bookStore.length);
		
		if(verifyTakeBook) {
			System.out.println("Excelente escolha, o livro " + bookStore[takeBook - 1] + " é muito bom!");
		} else {
			System.err.print("Desculpe não temos o livro nº " + takeBook + " !");
			System.exit(1);
		}
		
		scan.close();
		
	}
	// Método gerador de linhas
	static void lines() {
		System.out.println("🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇");
	}
	static void list() {
	
	}
}
