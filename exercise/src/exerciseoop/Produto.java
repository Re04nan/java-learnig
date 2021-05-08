package exerciseoop;

public class Produto {
	
	static final Integer QUANTITY_MIN_PRODUCT = 10;
	
	private String name;
	private Double price;
	private Integer quantity;

	Boolean reportQuantity() {
		return quantity < QUANTITY_MIN_PRODUCT;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Double getPrice() {
		return price;
	}

	void setPrice(Double price) {
		this.price = price;
	}

	Integer getQuantity() {
		return quantity;
	}

	void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
