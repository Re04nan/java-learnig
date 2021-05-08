package exerciseoop;

public class CentralDeControle {

	public static void main(String[] args) {
		Produto product = new Produto();
		
		product.name = "Notebooks";
		product.price = 3159.99;
		product.quantity = 20;
		
		productViewReport(product);
	}

	static void productViewReport(Produto product) {
		System.out.println("Produto: " + product.name + "\nPreço: R$" + product.price + "\nQuantidade: " + product.quantity);
	}
	
}
