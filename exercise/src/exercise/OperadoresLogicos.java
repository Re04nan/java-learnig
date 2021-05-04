package exercise;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean cart = false;
		Boolean productQuantityTen = true;
		Boolean sale = true;
		
//		Boolean verify = cart && productQuantityTen;
	
//		Boolean verify = cart || productQuantityTen;
	
//		Boolean verify = cart && productQuantityTen && sale;
	
		Boolean verify = cart || productQuantityTen && sale;
		
		if(verify) {
			System.out.println("Aplica desconto!");
		} else {
			System.out.println("Não aplica desconto!");
		}
	}

}
