package Vetores.exercicios.src.application;
import java.util.Scanner;
import java.util.Locale;

public class numerosPares {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n, qtdpares;
    System.out.println("Enter the lenght of this vector");
    n = sc.nextInt();
    double[] vect = new double[n]; 

    for (int i=0; i<n; i++) {
    System.out.println("Enter the vect[i] element");
      vect[i] = sc.nextDouble();
    }
    
    System.out.println("\nNUMEROS PARES:");

    qtdpares = 0;
    for (int i=0; i<n; i++) {
        if (vect[i] % 2 == 0) {
            System.out.println(vect[i]);
            qtdpares++;
        }
    }

    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

    sc.close();
    
    
  }
}
