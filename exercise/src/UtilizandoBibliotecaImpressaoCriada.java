import criandoumabiblioteca.BibliotecaImpressaoValores;

public class UtilizandoBibliotecaImpressaoCriada {

	public static void main(String[] args) {
		
		BibliotecaImpressaoValores screen = new BibliotecaImpressaoValores();
	
		Integer numberOne = screen.writeReadInteger("Digite um número: ");
		
		Integer numberTwo = screen.writeReadInteger("Digite outro número: ");
		
		Integer sum = numberOne + numberTwo;
		
		screen.print(Integer.toString(sum));
		
		screen.close();
	
	}

}
