package shoppingApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cart;
import entities.Product;

public class ShoppingApplication {

	private List<Product> products;
	private Cart cart;

	public ShoppingApplication() {
		this.products = new ArrayList<Product>();
		this.cart = new Cart();
		initializeProducts();
	}

	private void initializeProducts() {
		products.add(new Product(1, "Laptop", 800.00, 5));
		products.add(new Product(2, "Smartphone", 500.00, 10));
		products.add(new Product(3, "Headphones", 50.00, 20));
	}

	public void viewProductCatalog() {
		System.out.println("Available Products: ");
		for (Product product : products) {
			System.out.println(product.getDetails());
		}
	}

	public void handleAddToCart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID to add to cart : ");
		int id = sc.nextInt();
		System.out.println("Enter Quantity : ");
		int quantity = sc.nextInt();

		for (Product product : products) {
			if (product.getId() == id) {
				if (product.isInStock(quantity)) {
					cart.addProduct(product, quantity);
					product.reduceStock(quantity);
					System.out.println("Product added to cart.");
				} else {
					System.out.println("Insufficient stock available.");
				}
				return;
			}
		}
		System.out.println("Product not found. ");
	}

	public void handleRemoveFromCart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID to remove from cart: ");
		int id = sc.nextInt();
		System.out.println("Enter Quantity to remove: ");
		int quantity = sc.nextInt();

		cart.removeProduct(id, quantity);
	}

	public void handleViewCart() {
		cart.viewCart();
	}

	public void handleCheckout() {
		cart.checkout();
	}

	public static void main(String[] args) {

		ShoppingApplication app = new ShoppingApplication();
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("\n1. View Products");
				System.out.println("2. Add to Cart");
				System.out.println("3. Remove from Cart");
				System.out.println("4. View Cart");
				System.out.println("5. Checkout");
				System.out.println("6. Exit");
				System.out.print("Choose an option: ");
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					app.viewProductCatalog();
					break;
				case 2:
					app.handleAddToCart();
					break;
				case 3:
					app.handleRemoveFromCart();
					break;
				case 4:
					app.handleViewCart();
					break;
				case 5:
					app.handleCheckout();
					break;
				case 6:
					System.out.println("Good Bye");
					return;

				default:
					System.out.println("Invalid option. Please try again.");
				}
			}

		}

	}
}
