package POO.exercicios.src.application;
import java.util.Locale;
import java.util.Scanner;

import POO.exercicios.src.util.CurrencyConverter;

public class Program {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dolarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dolarBought = sc.nextDouble();

        //System.out.println("Amount to be paid in reais: ", CurrencyConverter.reais);

        System.out.printf("Dolar Price: %.2f%n", dolarPrice);
        System.out.printf("Dolar Bought: %.2f%n", dolarBought);

        System.out.printf("Amount to be paid in reais: R$ %.2f%n", CurrencyConverter.amountReais(dolarPrice, dolarBought));

        sc.close();

    }
}
