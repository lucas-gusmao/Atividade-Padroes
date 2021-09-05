package br.edu.ifpb.padroes.service.payment;

public class StrategyCreditCard implements StrategyPaymentService{
    @Override
    public void doPayment(PaymentType type) throws Exception {
        System.out.println("Do Credit Card payment!");
    }
    
}
