package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.service.payment.StrategyPaymentService;

public interface PaymentService{

    public void Payment(StrategyPaymentService strategyPaymentService){
        this.strategyPaymentService = strategyPaymentService;
    }
    
    private StrategyPaymentService strategyPaymentService;

    public static void doPayment(PaymentType type) throws Exception {
        return strategyPaymentService.doPayment(type);

    }

}
