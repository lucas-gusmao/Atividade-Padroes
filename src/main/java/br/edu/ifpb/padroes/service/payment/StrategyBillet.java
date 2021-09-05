package br.edu.ifpb.padroes.service.payment;

public interface StrategyBillet implements strategyPaymentService{
    
    @Override
    public void doPayment(PaymentType type) throws Exception {
        System.out.println("Do billet payment!");
    }
    
    
}
