package contract.entities;

import contract.interfaces.PaymentService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDateTime date;
    private Double contractValue;
    private Integer installments;
    private List<MonthlyPayment> monthlyPaymentList = new ArrayList<>();

    public Contract() {
    }

    public Contract(Integer monthlyPayments, Double contractValue, LocalDateTime date, Integer number) {
        this.contractValue = contractValue;
        this.date = date;
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getContractValue() {
        return contractValue;
    }

    public void setContractValue(Double contractValue) {
        this.contractValue = contractValue;
    }

    public List<MonthlyPayment> getMonthlyPaymentList() {
        return monthlyPaymentList;
    }

    public void setMonthlyPaymentList(MonthlyPayment monthlyPaymentList) {
        this.monthlyPaymentList.add(monthlyPaymentList);
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    public void processContractPayment(PaymentService paymentService) {
        for(int i=0; i<installments; i++) {
            MonthlyPayment monthlyPayment = new MonthlyPayment();
            monthlyPayment.setValue(paymentService.finalValue(i + 1, contractValue/installments));
            monthlyPayment.setDate(date.plusMonths(i+1));
            this.monthlyPaymentList.add(monthlyPayment);
        }
    }


}
