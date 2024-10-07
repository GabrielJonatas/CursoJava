package entities;

public class Individual extends TaxPayer {
	private Double healthCareExpenses;
	
	public Individual(String name, Double annualIncome, Double healthCareExpenses) {
		super(name, annualIncome);
		this.healthCareExpenses = healthCareExpenses;
	}

	public Double getHealthCareExpenses() {
		return healthCareExpenses;
	}

	public void setHealthCareExpenses(Double healthCareExpenses) {
		this.healthCareExpenses = healthCareExpenses;
	}

	@Override
	public Double taxToPay() {
		double tax = 0.0;
		
		if(this.getAnnualIncome() < 20000.00) {
			tax += this.getAnnualIncome()*0.15;
		} else if(this.getAnnualIncome() >= 20000.00) {
			tax += this.getAnnualIncome()*0.25;
		}
		
		if(healthCareExpenses > 0.0) {
			double discount = healthCareExpenses * 0.5;
			tax -= discount;
		}
		
		return tax;
	}

}
