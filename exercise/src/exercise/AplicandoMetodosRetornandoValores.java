package exercise;

import java.util.Scanner;

public class AplicandoMetodosRetornandoValores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double[] values = new Double[2];
		
		print("Digite o valor de A = ");
		values[0] = scan.nextDouble();
		
		print("Digite o valor de B = ");
		values[1] = scan.nextDouble();
		
		print("Digite o valor de C = ");
		Double proportionValue = scan.nextDouble();
		
		Double result = ruleOfThree(values, proportionValue);
		
		print("Resultado = " + result);
		
		scan.close();
	}
	// Algoritmo depende da pessoa anexar as informações correta em seus devidos campos
	static Double ruleOfThree(Double[] initialValues, Double proportion) {
		Double result;
		Boolean verifyProportion = (initialValues[0] <= initialValues[1]) && (proportion >= initialValues[0]); 
		
		if (verifyProportion) {
			result = (proportion * initialValues[1])/ initialValues[0];	
		} else { 
			result = (initialValues[1] * initialValues[0])/ proportion;
		} 
		
		return result;
	}
	static void print(String text) {
		System.out.print(text);
	}

}
