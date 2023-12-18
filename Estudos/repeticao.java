//Bibliotecas
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int x = sc.nextInt();
    int soma = 0;

    while (x != 0) {

      System.out.println("Digite um número: ");
      x = sc.nextInt();
      soma += x;

    }

    System.out.println("A soma é: " + soma);
    sc.close();

  }
}