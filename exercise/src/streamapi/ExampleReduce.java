package streamapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
//import java.util.function.BinaryOperator;

import streamapi.model.Product;
import streamapi.model.Product.Status;

public class ExampleReduce {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Arroz 5kg", Status.ACTIVE, new BigDecimal(60.0)));
		products.add(new Product("Feijão 1kg", Status.ACTIVE, new BigDecimal(19.9)));
		products.add(new Product("Peito de frango 1Kg", Status.ACTIVE, new BigDecimal(8.98)));
		products.add(new Product("Água 5L", Status.ACTIVE, new BigDecimal(10.9)));
		products.add(new Product("Picanha 1Kg", Status.ACTIVE, new BigDecimal(39.9)));
		
		// big decimal para valores monetários.
//		BigDecimal total = BigDecimal.ZERO;
//		
//		for (Product product : products) {
//			if(product.getStatus().equals(Status.ACTIVE)) {
//				total = total.add(product.getPrice());
//			}
//		}
		
//		BinaryOperator<BigDecimal> operator = (x, y) -> x.add(y);
		
		BigDecimal total = products.stream()
				.filter(p -> p.getStatus().equals(Status.ACTIVE))
				.map(Product::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		
		System.out.println(total);
	}

}
