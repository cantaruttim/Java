package Heranca_Polimorfismo.srcClassAbstract.application;

import Heranca_Polimorfismo.srcClassAbstract.entities.Account;
import Heranca_Polimorfismo.srcClassAbstract.entities.BusinessAccount;
import Heranca_Polimorfismo.srcClassAbstract.entities.SavingsAccount;

// import Heranca_Polimorfismo.srcClasseAbstract.entities.Account;
// import Heranca_Polimorfismo.srcClasseAbstract.entities.BusinessAccount;
// import Heranca_Polimorfismo.srcClasseAbstract.entities.SavingsAccount;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class Program {
 public static void main(String[] args) {

    // classe abstrata não pode ser instanciada
    // Account acc1 = new Account(1001, "Alex", 1000.0);
    /* 
    Account acc2 = new SavingsAccount(1002, "Bob", 10000.0, 0.01);
    Account acc3 = new BusinessAccount(1003, "Maria", 1000.0, 1000.0);
    */
    Locale.setDefault(Locale.US);
    List<Account> list = new ArrayList<>();
    list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
    list.add(new SavingsAccount(1001, "Matheus", 15000.0, 0.01));
    list.add(new BusinessAccount(1001, "Alex", 500.0, 1000.50));
    list.add(new BusinessAccount(1001, "Gabriella", 5100.0, 2000.50));

    double sum = 0.0;
    for (Account acc : list ) {
        sum += acc.getBalance();
    }

    System.out.printf("Total Balance: %.2f%n", sum);


    for (Account acc : list) {
        acc.deposit(10.0);
    }

    for (Account acc : list) {
        System.out.printf("Updated Balance: %d: %.2f%n", acc.getNumber(), acc.getBalance());
    }
}}
