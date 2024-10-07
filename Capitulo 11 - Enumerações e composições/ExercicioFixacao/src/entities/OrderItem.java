package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;

	public OrderItem(Product product, Integer quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.price = product.getPrice();
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", this.subTotal());
	}
}
