package exercise;

import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String textA = scan.nextLine(); // = "string"
		System.out.println(textA);
		
		Character textB = 'Z'; // 1 value between ''
		System.out.println(textB);	
		
		scan.close();
	}

}
