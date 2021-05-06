package exercise;

import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] tasks = new String[5]; 
		
		System.out.print("Adicionar tarefas:\n");
		for (int i = 0; i < tasks.length; i++) {
			tasks[i] = scan.nextLine();
		}
		
		System.out.println("Listando tarefas: \n");
		for (int counter = 0; counter < tasks.length; counter++) {
			System.out.println("[" + counter + "] " + tasks[counter]);
		}
		
		scan.close();
	}

}
