package Heranca_Polimorfismo.src.application;

import Heranca_Polimorfismo.src.entities.Account;
import Heranca_Polimorfismo.src.entities.BusinessAccount;
import Heranca_Polimorfismo.src.entities.SavingsAccount;

// import Heranca_Polimorfismo.src.entities.Account;
// import Heranca_Polimorfismo.src.entities.BusinessAccount;
// import Heranca_Polimorfismo.src.entities.SavingsAccount;

public class Program {
 public static void main(String[] args) {

    Account acc1 = new Account(1001, "Matheus", 1000.0);
    acc1.withdraw(200);
    System.out.println(acc1.getBalance());

    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    acc2.withdraw(200);
    System.out.println(acc2.getBalance());

    Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
    acc3.withdraw(200);
    System.out.println(acc3.getBalance());
    
    /* 
    Account acc = new Account(1001, "Matheus", 0.0);
    BusinessAccount bcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    // UPCASTING
    Account acc1 = bcc; // subclasse ser atribuido a um obj da super classe (E1). BCC é uma conta
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

    // DOWNCASTING
    // BusinessAccount acc4 = acc2; // não podemos converter uma variavel da subclasse para uma superclasse
    BusinessAccount acc4 = (BusinessAccount)acc2; // casting manual
    acc4.loan(100.0);

    // BusinessAccount acc5 = (BusinessAccount)acc3; // subclass -> subclasse

    if (acc3 instanceof BusinessAccount){
        BusinessAccount acc5 = (BusinessAccount)acc3;
        acc5.loan(500.0);
        System.out.println("Loan!!");
    }

    if (acc3 instanceof SavingsAccount){
        SavingsAccount acc5 = (SavingsAccount)acc3;
        acc5.updateBalance();
        System.out.println("Updated!");
    }
    */

 }   
}
