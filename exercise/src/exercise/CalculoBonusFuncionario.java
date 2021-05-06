package exercise;

import java.util.Scanner;

public class CalculoBonusFuncionario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// valores tratados de forma fict�cia. Em um cen�rio real seria derivado de valores reais e opera��es matem�ticas.
		
		System.out.print("Meta para faturamento ano = R$ ");
		Double metaBillingYear = scan.nextDouble();
		
		System.out.print("Faturamento ano = R$ ");
		Double billingYear = scan.nextDouble();
		
		System.out.print("Digite a media salarial no ano do funcion�rio(a): R$ ");
		Double mediaSalaryYear = scan.nextDouble();
		
		Boolean bonus_100Porcent = billingYear >= metaBillingYear; 
		Boolean bonus_80Porcent = (billingYear >= (metaBillingYear*80)/100);
		
		if (bonus_100Porcent) {
			Double valueBonus_100Porcent = mediaSalaryYear*2;
			System.out.print("Meta alcan�ada, b�nus para funcion�rios(as) = R$ " + valueBonus_100Porcent);
		} else if (bonus_80Porcent) {
			Double valueBonus_80Porcent = (mediaSalaryYear + (mediaSalaryYear*80)/100);
			System.out.print("Meta de 80% ou maior alcan�ada, b�nus = R$ " + valueBonus_80Porcent);			
		} else {
			System.out.print("N�o atingiu a meta, ent�o n�o ter� b�nus!");
		}
		
		scan.close();
	}

}
