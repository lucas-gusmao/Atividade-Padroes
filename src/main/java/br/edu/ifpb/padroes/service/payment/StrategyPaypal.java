package br.edu.ifpb.padroes.service.payment;

public class StrategyPaypal implements StrategyPaymentService{

    @Override
    public void doPayment(PaymentType type) throws Exception {
        System.out.println("Do paypal payment!");
    }
    
}
