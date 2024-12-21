package entities;

public class CartItem {

	private Product product;
	private int quantity;

	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return product.getPrice() * quantity;
	}

	public void increaseQuantity(int additionalQuantity) {
		this.quantity += additionalQuantity;
	}

	public void reduceQuantity(int quantity) {
		this.quantity -= quantity;
		if (this.quantity < 0) {
			this.quantity = 0;
		}
	}

}
