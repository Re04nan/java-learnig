package streamapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Predicate;
//import java.util.stream.Stream;

import streamapi.model.Product;
import streamapi.model.Product.Status;

public class ExampleFilterForEach {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Arroz 5kg", Status.ACTIVE, new BigDecimal(60.0)));
		products.add(new Product("Feijão 1kg", Status.ACTIVE, new BigDecimal(19.9)));
		products.add(new Product("Peito de frango 1Kg", Status.ACTIVE, new BigDecimal(8.98)));
		products.add(new Product("Água 5L", Status.ACTIVE, new BigDecimal(10.9)));
		products.add(new Product("Picanha 1Kg", Status.ACTIVE, new BigDecimal(39.9)));
		
//		for(Product product : products) {
//			if(product.getName().startsWith("N")) {
//				product.inactive();
//			}
//		}
		//Stream API e Lambda Expression
//		Predicate<Product> predicate = p -> p.getName().startsWith("N");
//		Consumer<Product> consumer = p -> p.inactive();
//		
//		Stream<Product> productsStream = products.stream().filter(predicate);
//		
//		productsStream.forEach(consumer);

		products.stream()
			.filter(p -> p.getName().startsWith("P"))
			.forEach(Product::inactive);// Method References
		
	}
}
