package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LendoArquivosTextos {

	public static void main(String[] args) throws IOException {
			
		
		Path pathText = Paths.get("E://file.txt");
		List<String> readText = Files.readAllLines(pathText);
		
		for(int i = 0; i < readText.size(); i++) {
			System.out.println(readText.get(i));
		}
		
	}

}
