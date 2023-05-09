import java.util.Locale;
import java.util.Scanner;

public class Vectors {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// criando um vetor
		double[] vect = new double[n];
		
		// inserindo as alturas dentro do vetor
		for (int i = 0; i < n ; i++) {
			vect[i] = sc.nextDouble();
		}
			
		
		double sum = 0.0;	
		for (int i = 0; i < n ; i++) {
			sum += vect[i];
		}
		
		
		double avg = sum / n;	
		System.out.printf("AVERAGE HEIGTH: %.2f%n", avg);
		
				
		sc.close();
	}

}
