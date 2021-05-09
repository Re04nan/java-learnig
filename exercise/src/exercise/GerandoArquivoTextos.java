package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GerandoArquivoTextos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> writeText = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um nome: ");
			writeText.add(scan.nextLine());
		}
		
		scan.close();
		
		Path pathName = Paths.get("E://file.txt");
		try {
			Files.write(pathName, writeText);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
