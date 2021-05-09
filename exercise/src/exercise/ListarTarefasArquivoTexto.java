package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListarTarefasArquivoTexto {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String task;
		
		ArrayList<String> listTask = new ArrayList<String>();
		
		System.out.println("Digite suas tarefas ou [x] para sair: ");
		
		while(true){
			task = scan.nextLine(); 

			if ("x".equals(task)){
				break;
			}

			listTask.add(task);
		}
	
		scan.close();
	
		Path pathName = Paths.get("E://file.txt");
		Files.write(pathName, listTask);
	}

}
