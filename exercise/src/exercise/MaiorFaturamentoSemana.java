package exercise;

public class MaiorFaturamentoSemana {

	public static void main(String[] args) {
		Double[] weekOne = new Double[] {
				100.99, 200.0, 400.45, 150.0
		};
		Double[] weekTwo = new Double[] {
				40.99, 120.0, 300.45, 350.0, 600.00
		};
		Double[] weekThree = new Double[] {
				120.99, 180.0, 500.45, 250.0
		};
		
		Double[][] billing = new Double[][] {
			weekOne, weekTwo, weekThree
		};
		
		Double biggerBilling = 0.0;
		Integer week = null;
		
		for(int i = 0; i < billing.length; i++) {
			Double[] billingWeek = billing[i];
			
			Double sum = 0.0;
			
			for(int j = 0; j < billingWeek.length; j++) {
				sum += billingWeek[j];
			}
			Boolean verifyBiggerBilling = sum > biggerBilling;
			
			if(verifyBiggerBilling) {
				biggerBilling = sum;
				week = i + 1;
			}	
			sum = 0.0;
		}
		
		System.out.println("O maior faturamento foi na " + week + "° semana totalizando R$ " + biggerBilling);
	}

}
