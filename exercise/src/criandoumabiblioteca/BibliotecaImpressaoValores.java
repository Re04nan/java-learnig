package criandoumabiblioteca;

import java.util.Scanner;

public class BibliotecaImpressaoValores {
	
	Scanner scan = new Scanner(System.in);
	
	public void print(String text) {
		System.out.print(text);
	}
	
	public void printError(String text) {
		System.err.print(text);
	}
	
	public String writeReadString(String text) {
		print(text);
		return scan.nextLine();
	}
	
	public Integer writeReadInteger(String text) {
		print(text);
		return scan.nextInt();
	}
	
	public Double writeReadDouble(String text) {
		print(text);
		return scan.nextDouble();
	}
	
	public void close() {
		scan.close();
	}

}
