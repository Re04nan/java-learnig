package exercise;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Integer sum = 1 + 2;
		System.out.println("Soma = "+ sum);
		
		Integer subtraction = 1 - 2;
		System.out.println("Subtração = "+ subtraction);
		
		Integer multiplication = 1 * 2;
		System.out.println("Multiplicação = "+ multiplication);
		
		Integer division = 1 / 2;
		System.out.println("Divisão = "+ division);
		
		Integer module = 3 % 4;
		System.out.println("Módulo da divisão = "+ module);
		
		//Ordem de procedência.

		Integer operation = 2 + 1 * 2;
		System.out.println("Resultado da operação = "+ operation);

		Integer operation2 = (2 + 1) * 2;
		System.out.println("Resultado da operação = "+ operation2);

	}

}
