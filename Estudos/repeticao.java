//Bibliotecas
import java.util.Scanner;


/* Este programa lê os números digitados e se for igual à zero, soma os números até aquela posição */
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
