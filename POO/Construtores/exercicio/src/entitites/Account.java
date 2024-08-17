package POO.Construtores.exercicio.src.entitites;

public class Account {

    private int number;
    private String Holder;
    private double balance;

    public Account(int number, String Holder) {
        this.number = number;
        this.Holder = Holder;

    }

    public Account(int number, String Holder, double initialDeposit) {
        this.number = number;
        this.Holder = Holder;
        deposit(initialDeposit);
    }


    // Getters e Setters 
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String Holder) {
        this.Holder = Holder;
    }

    public double getBalance() {
        return balance;
    }



    // metodos:
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }


    // toString
    public String toString() {
        return "Account "
                + getNumber()
                + ", Holder: "
                + getHolder()
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }       
    
}
