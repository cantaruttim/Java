//Bibliotecas
import java.util.Scanner;
import java.util.Locale;

class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int x;
    double y;

    x = sc.nextInt();
    System.out.println("para x você digitou: " + x);

    y = sc.nextDouble();
    System.out.println("para y você digitou: " + y);

    sc.close();

 
    // operadores bit-a-bit 

    int x = 5;
    int y = 10;

    System.out.println(x & y);
    System.out.println(x | y);
    System.out.println(x ^ y);

   

  }
}