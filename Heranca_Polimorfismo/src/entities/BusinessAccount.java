package Heranca_Polimorfismo.src.entities;

public class BusinessAccount extends Account  {
    
    private Double LoanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double LoanLimit ){
        super(number, holder, balance);
        this.LoanLimit = LoanLimit;
    }

    public Double LoanLimit(){return LoanLimit;}
    public void setLoanLimit(Double LoanLimit){this.LoanLimit = LoanLimit;}

    public void loan(Double amount){
        if (amount <= LoanLimit) {
            deposit(amount - 10.0);
        }
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

}
