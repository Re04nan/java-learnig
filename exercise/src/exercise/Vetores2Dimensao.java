package exercise;

public class Vetores2Dimensao {

	public static void main(String[] args) {
		Double[] billingMonth = new Double[] {
				1000.90, 3000.00, 2830.90 
		};
		Double[] billingYear = new Double[] {
				9000.90, 13000.00, 10830.90 
		};
		// vetores 2D é composto por vetores 1D
		Double[][] billing = new Double[][] {
			billingMonth, billingYear
		};
		
		//System.out.print("Faturamento Mês 1 = R$ " + billing[0][2]);
		
		for (int i = 0; i < billing.length; i++) {
			if(i == 0) {
				System.out.println("\nFaturamento Mês:\n");
			} else {
				System.out.println("\nFaturamento Ano:\n");
			}
			for(int j = 0; j < billingMonth.length; j++) {
				System.out.println(billing[i][j]);
			}
		}
		
		
	}

}
