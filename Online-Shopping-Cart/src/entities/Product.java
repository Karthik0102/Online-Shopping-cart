package entities;

public class Product {

	private int id;
	private String name;
	private double price;
	private int quantity;

	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDetails() {
		return "Product ID : " + id + "\n Product Name : " + name + "\n Product Price : " + price + "\n Quantity : "
				+ quantity;
	}

	public boolean isInStock(int requestedQuantity) {
		if (requestedQuantity <= quantity) {
			return true;
		}
		return false;
	}

	public void reduceStock(int amount) {
		this.quantity -= amount;
	}
}
