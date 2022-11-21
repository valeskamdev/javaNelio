package exercicio.dolar;

public class CurrencyConverter {

    public double dollar;
    public double dollarsBought;

    public double dollarCalculation() {
        double dollarValue = dollar * dollarsBought;
        return  dollarValue += dollarValue * 6 / 100;
    }
}
