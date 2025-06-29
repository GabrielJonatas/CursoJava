package contract.services;

import contract.interfaces.PaymentService;

public class PaypalPaymentService implements PaymentService {
    private Double paymentTax = 0.02;
    private Double simpleInterest = 0.01;

    public Double finalValue(Integer installment, Double value) {
        return value*(1+(simpleInterest*installment))*(1+paymentTax);
    }
}
