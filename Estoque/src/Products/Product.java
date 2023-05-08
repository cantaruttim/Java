package Products;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	// CONSTRUTOR
	public Product(String name, double price, int quantity) {
		// forma de diferenciar entre o atributo do objeto e o parâmetro do método
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;

	}
	
	// para podermos acessar o valor do atributo name
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public int getQuantity() {
		return quantity;
	}

	
	public double totalValueInStock() {
		return price * quantity;
	}

	
	public void addProducts(int quantity) {
		this.quantity += quantity; // O this. acessa o atributo da classe e não o valor de parâmetro.
	}

	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
		
	