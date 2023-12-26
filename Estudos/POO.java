import java.util.Locale;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data: ");
    System.out.println("Enter product name: ");
    String name = sc.nextLine();
    System.out.println("Enter product price: ");
    double price = sc.nextDouble();
    System.out.println("Enter product quantity: ");
    int quantity = sc.nextInt();

    Product product = new Product(name, price, quantity);

    System.out.println();
    System.out.println("Product data: " + product);

    quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println("Updated data: " + product);

    System.out.println();
    System.out.println("Enter product's quantity to be removed: ");

    quantity = sc.nextInt();
    product.removeProducts(quantity);
    System.out.println("Updated data: " + product);


    sc.close();
   
  }  
}

class Product {

  public String name;
  public double price;
  public int quantity;

  public Product(String name, double price, int quantity) {
    // constructor
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    
  }

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
    return name 
          + ", $ "
          + String.format("%.2f", price)
          + ", "
          + quantity
          + " units, Total: $ "
          + String.format("%.2f", totalValueInStock());
  }
  
}
