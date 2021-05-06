package exercise;

import java.util.Scanner;

public class CalculoBonusFuncionario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// valores tratados de forma fictícia. Em um cenário real seria derivado de valores reais e operações matemáticas.
		
		System.out.print("Meta para faturamento ano = R$ ");
		Double metaBillingYear = scan.nextDouble();
		
		System.out.print("Faturamento ano = R$ ");
		Double billingYear = scan.nextDouble();
		
		System.out.print("Digite a media salarial no ano do funcionário(a): R$ ");
		Double mediaSalaryYear = scan.nextDouble();
		
		Boolean bonus_100Porcent = billingYear >= metaBillingYear; 
		Boolean bonus_80Porcent = (billingYear >= (metaBillingYear*80)/100);
		
		if (bonus_100Porcent) {
			Double valueBonus_100Porcent = mediaSalaryYear*2;
			System.out.print("Meta alcançada, bônus para funcionários(as) = R$ " + valueBonus_100Porcent);
		} else if (bonus_80Porcent) {
			Double valueBonus_80Porcent = (mediaSalaryYear + (mediaSalaryYear*80)/100);
			System.out.print("Meta de 80% ou maior alcançada, bônus = R$ " + valueBonus_80Porcent);			
		} else {
			System.out.print("Não atingiu a meta, então não terá bônus!");
		}
		
		scan.close();
	}

}
