package exercise;

import criandoumabiblioteca.BibliotecaImpressaoValores;

public class UtilizandoBibliotecaImpressao {

	public static void main(String[] args) {
		
		BibliotecaImpressaoValores screen = new BibliotecaImpressaoValores();
	
		Integer numberOne = screen.writeReadInteger("Digite um n�mero: ");
		
		Integer numberTwo = screen.writeReadInteger("Digite outro n�mero: ");
		
		Integer sum = numberOne + numberTwo;
		
		screen.print(Integer.toString(sum));
		
		screen.close();
	
	}

}
