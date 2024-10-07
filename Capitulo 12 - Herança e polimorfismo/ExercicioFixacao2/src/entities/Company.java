package entities;

public class Company extends TaxPayer {
	private Integer employees;

	public Company(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double taxToPay() {
		double tax = 0.0;
		
		if(employees > 10) {
			tax += this.getAnnualIncome()*0.14;
		} else {
			tax += this.getAnnualIncome()*0.16;
		}
		
		return tax;
	}

}
