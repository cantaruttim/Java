package POO.exercicios.src.util;

public class CurrencyConverter {
    
    public static final double IOF_TAX = 0.06;

    public static double amountReais(double dolarPrice, double dolarBought) {
        
        return (dolarPrice * dolarBought) + IOF_TAX * (dolarPrice * dolarBought);
    }

}
