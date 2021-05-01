package exercise;

import java.util.Scanner;

public class ConcatenandoStrigns {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		String lastName = scan.nextLine();
		System.out.println(name + " " + lastName);
		scan.close();		
	}

}
