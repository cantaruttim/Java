package POO.Construtores.exercicio.src.application;
import java.util.Locale;
import java.util.Scanner;

import POO.Construtores.exercicio.src.entitites.Account;

public class Program {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder");
        String Holder = sc.nextLine();
        System.out.println("Is there an initial deposity (y/n)?");
        char d = sc.nextLine().charAt(0);
        

        if (d == 'y') {
            System.out.println("Enter initial deposit value:");
            double initialDeposit = sc.nextDouble();

            account = new Account(number, Holder, initialDeposit);

        } else {
            account = new Account(number, Holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter deposit a value :");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();

    }

}
