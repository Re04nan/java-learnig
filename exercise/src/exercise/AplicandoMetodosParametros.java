package exercise;

import java.util.Scanner;

public class AplicandoMetodosParametros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] listNames = new String[] {
				"Harry Potter", "Hermione Grange", "Ronald Weasley"  
		};
		// invocando métodos
		print("O bruxos mais famosos de todos os tempos: ");
		repeat(listNames);
		
		scan.close();
	}
	// método recebendo parâmetros 
	static void print(String text) {
		System.out.println(text);
	}
	
	static void repeat(String[] list) {
		for (int i = 0; i < list.length; i++) {
			print(list[i]);
		}
	}
}
