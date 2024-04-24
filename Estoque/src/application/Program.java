package application;

import java.util.Locale;
import java.util.Scanner;
import entitites.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Entre com os dados do produto:");
		System.out.println("Nome: ");
		product.name = sc.nextLine();
		System.out.println("Preço: ");
		product.price = sc.nextDouble();
		System.out.println("Quantidade: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do Produto: " + product);
		
		System.out.println();
		System.out.println("Quantidade a ser adicionada");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Dados Atualizados: " + product);
		
		System.out.println("Quantidade a ser removida");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("Dados Atualizados: " + product);
		
		sc.close();

	}

}
