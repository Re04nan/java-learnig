package streamapi;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import streamapi.model.Category;
import streamapi.model.Product;
import streamapi.model.Product.Status;


public class ExampleMapCollect {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		Category categoryBeefs = new Category("Carnes");
		Category categoryOthers = new Category("Outros");
		Category categoryDrinks = new Category("Bebidas");
		
		products.add(new Product("Arroz 5kg", Status.ACTIVE, new BigDecimal(60.0), categoryOthers));
		products.add(new Product("Feijão 1kg", Status.ACTIVE, new BigDecimal(19.9), categoryOthers));
		products.add(new Product("Peito de frango 1Kg", Status.ACTIVE, new BigDecimal(8.98), categoryBeefs));
		products.add(new Product("Água 5L", Status.INACTIVE, new BigDecimal(10.9), categoryDrinks));
		products.add(new Product("Picanha 1Kg", Status.ACTIVE, new BigDecimal(39.9), categoryBeefs));
		
//		List<Category> categories = new ArrayList<>();
		
//		for(Product product : products) {
//			if(product.getStatus().equals(Status.ACTIVE)) {
//				Category category = product.getCategoryProduct();
//				
//				if(!categories.contains(category)) {
//					categories.add(category);
//				}
//			}
//		}
		// Map Collect - distinct
		List<Category> categories = products.stream()
				.filter(p -> p.getStatus().equals(Status.ACTIVE))
				.map(Product::getCategoryProduct)
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(categories);
	}

}
