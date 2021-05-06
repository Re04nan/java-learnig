package exercise;

public class IteracaoFor {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 3; i++) {
//			System.out.println("Repita 3 vezes!");
//		}
		
//		Double[] buyCart = new Double[] { 100.0, 20.0, 50.0};
//		Double total = 0.0;
//		
//		for (int i = 0; i < buyCart.length; i ++) {
//			total += buyCart[i];
//			System.out.println("Valor total do carrinho = R$ " + total);
//		}
		
		Integer[] buyCart2 = new Integer[] { 100, 20, 50};
		Integer total = 0;
		
		for (int i = 0; i < buyCart2.length; i ++) {
			total += buyCart2[i];
			System.out.println(buyCart2[i]);
			if(buyCart2[i] == 20) {
				System.out.println("Valor total do carrinho = R$ " + total);
				continue;
				//break;
			}
		}
	}

}
