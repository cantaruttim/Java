package Exercicio_EnumOne.src.entities;

public class OrderItem {

    private Integer quantity;
    private double price;

    private Product product;

    public OrderItem(){}
    public OrderItem(Integer quantity, double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity(){return quantity;}
    public double getPrice(){return price;}

    public void setQuantity(Integer quantity){this.quantity = quantity;}
    public void setPrice(double price){this.price = price;}

    public double subTotal(){
        return quantity * price;
    }

    @Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
    
    }
}
