package exercise;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Integer sum = 1 + 2;
		System.out.println("Soma = "+ sum);
		
		Integer subtraction = 1 - 2;
		System.out.println("Subtra��o = "+ subtraction);
		
		Integer multiplication = 1 * 2;
		System.out.println("Multiplica��o = "+ multiplication);
		
		Integer division = 1 / 2;
		System.out.println("Divis�o = "+ division);
		
		Integer module = 3 % 4;
		System.out.println("M�dulo da divis�o = "+ module);
		
		//Ordem de proced�ncia.

		Integer operation = 2 + 1 * 2;
		System.out.println("Resultado da opera��o = "+ operation);

		Integer operation2 = (2 + 1) * 2;
		System.out.println("Resultado da opera��o = "+ operation2);

	}

}
