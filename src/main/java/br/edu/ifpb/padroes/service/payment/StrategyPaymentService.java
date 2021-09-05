package br.edu.ifpb.padroes.service.payment;

public interface StrategyPaymentService {
    public void doPayment(PaymentType type) throws Exception;
}
