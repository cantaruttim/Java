package entitites;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		// Sobreponho o método toString padrão da classe
		
		return name
				+ ", R$ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unidades, Total: R$ "
				+ String.format("%.2f", totalValueInStock()); 
		
	}

}
