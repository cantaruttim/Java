import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class precoMedioProduto {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // tamanho do vetor
		Products[] vect = new Products[n]; // todos os N elementos do vetor estão como NULLOS (heap)
		// vect.length 
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Products(name, price); // instânciando novos produtos
			
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
				
		sc.close();

	}

}
