package exercise;

public class EstruturaIf {

	public static void main(String[] args) {
		Integer cardCreditTotal = 1000;
		Integer cardCreditLimit = 2000;
	//	Boolean verify = cardCreditTotal <= cardCreditLimit;
		
		if(cardCreditTotal < cardCreditLimit) {
			System.out.println("Empr�stimo autorizado!");
		} else {
			System.out.println("Empr�stimo n�o autorizado!");
		}
	}

}
