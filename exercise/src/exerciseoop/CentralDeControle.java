package exerciseoop;

public class CentralDeControle {

	public static void main(String[] args) {
		Produto product = new Produto();
		
//		product.name = "Notebooks";
//		product.price = 3159.99;
//		product.quantity = 20;
		
//		aplicando encapsulamento
		
		product.setName("Notebooks");
		product.setPrice(3159.99);
		product.setQuantity(20);
		
		productViewReport(product);
		
		System.out.println("É necessário repor o estoque do produto? " + product.reportQuantity());
		
	}

	static void productViewReport(Produto product) {
		System.out.println("Produto: " + product.getName() + "\nPreço: R$" + product.getPrice() + "\nQuantidade: " + product.getQuantity());
	}
// Metódo static foi substituído por um de instância
//	static Boolean reportQuantity(Produto product) {
//		if(product.quantity < Produto.QUANTITY_MIN_PRODUCT) {
//			return true;
//		}
//		return false;
//	}
	
}
