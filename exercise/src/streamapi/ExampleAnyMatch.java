package streamapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import streamapi.model.Product;
import streamapi.model.Product.Status;

public class ExampleAnyMatch {
		public static void main(String[] args) {
			List<Product> products = new ArrayList<>();
			
			products.add(new Product("Arroz 5kg", Status.ACTIVE, new BigDecimal(60.0)));
			products.add(new Product("Feijão 1kg", Status.ACTIVE, new BigDecimal(19.9)));
			products.add(new Product("Peito de frango 1Kg", Status.ACTIVE, new BigDecimal(8.98)));
			products.add(new Product("Água 5L", Status.ACTIVE, new BigDecimal(10.9)));
			products.add(new Product("Picanha 1Kg", Status.ACTIVE, new BigDecimal(39.9)));
			
//			boolean picanha = false;
//			
//			for (Product product : products) {
//				if(product.getName().equals("Picanha 1kg")) {
//					picanha = true;
//					break;
//				}
//			}
			
			// anyMatch se qualquer elemento corresponde ao predicate(uma afirmação) e retorna true ou false.
			boolean picanha = products.stream()
					.anyMatch(p -> p.getName().equals("Picanha 1Kg"));
			
			System.out.println(picanha);
			
		}
}
