package strategy_Pattern.iImpl;

import strategy_Pattern.interfaceEx.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
    }
}
