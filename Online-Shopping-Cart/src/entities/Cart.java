package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<CartItem> cartItems;

	public Cart() {
		this.cartItems = new ArrayList<CartItem>();
	}

	public void addProduct(Product product, int quantity) {
		for (CartItem item : cartItems) {
			if (item.getProduct().getId() == product.getId()) {
				item.increaseQuantity(quantity);
				return;
			}
		}
		cartItems.add(new CartItem(product, quantity));
	}

	public void removeProduct(int productId, int quantityToRemove) {
		for (CartItem item : cartItems) {
			if (item.getProduct().getId() == productId) {
				if (item.getQuantity() > quantityToRemove) {
					item.reduceQuantity(quantityToRemove);
					System.out.println(quantityToRemove + " units removed from the cart.");
				} else {
					cartItems.remove(item);
					System.out.println("Product removed from the cart.");
				}
				return;
			}
		}
		System.out.println("Product not found in the cart.");
	}

	public void viewCart() {
		if (cartItems.isEmpty()) {
			System.out.println("Your cart is empty.");
			return;
		}
		double total = 0;
		System.out.println("Items in your cart : ");
		for (CartItem item : cartItems) {
			Product product = item.getProduct();
			System.out.printf("Product ID: %d\nProduct Name: %s\nProduct Price: %.2f\nQuantity in Cart: %d\n\n",
					product.getId(), product.getName(), product.getPrice(), item.getQuantity());
			total += item.getTotalPrice();
		}
		System.out.printf("Total Cost : $%.2f\n", total);
	}

	public void checkout() {
		if (cartItems.isEmpty()) {
			System.out.println("Your cart is empty. Nothing to checkout.");
			return;
		}
		double total = 0;
		for (CartItem item : cartItems) {
			total += item.getTotalPrice();
		}

		System.out.printf("Your total purchase amount is: $%.2f\n", total);
		cartItems.clear();
		System.out.println("Thank you for your purchase!");

	}

}
