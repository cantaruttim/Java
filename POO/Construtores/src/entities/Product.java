package POO.Construtores.src.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    // construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // sobrecarga é a possibilidade de disponibilizar mais de uma versão de um objeto.
    public Product() {

    }

    // sobrecarga é a possibilidade de disponibilizar mais de uma versão de um objeto.
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Implementacao de Getters e Setters
    // pega o valor do atributo
    public String getName() {
        return name;
    }
    // altera o valor do atributo
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
    

    // metodos:
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
        return this.getName()
                    + ", $ "
                    + String.format("%.2f", this.getPrice())
                    + ", "
                    + this.getQuantity()
                    + " units, Total: $ "
                    + String.format("%.2f", totalValueInStock());

}
}