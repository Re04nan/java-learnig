package streamapi.model;

import java.math.BigDecimal;

public class Product {
	
	public enum Status {
		ACTIVE, INACTIVE
	}
	
	private String name;
	private Status status;
	private BigDecimal price;
	private Category categoryProduct;
	
	public Product(String name, Status status, BigDecimal price) {
		super();
		this.name = name;
		this.status = status;
		this.price = price;
	}

	public Product(String name, Status status, BigDecimal price, Category categoryProduct) {
		super();
		this.name = name;
		this.status = status;
		this.price = price;
		this.categoryProduct = categoryProduct;
	}

	public String getName() {
		return name;
	}

	public Status getStatus() {
		return status;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Category getCategoryProduct() {
		return categoryProduct;
	}
	
	public void inactive() {
		System.out.println("Inativo: " + getName());
		
		this.status = Status.INACTIVE;
	}

	
}
