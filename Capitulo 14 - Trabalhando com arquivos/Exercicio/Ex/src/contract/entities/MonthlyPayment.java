package contract.entities;

import java.time.LocalDateTime;

public class MonthlyPayment {
    private LocalDateTime date;
    private double value;

    public MonthlyPayment() {}

    public MonthlyPayment(LocalDateTime date, double value) {
        this.date = date;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
