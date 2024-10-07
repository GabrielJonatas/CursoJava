package exercicio02;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void IncreaseSalary(double percentage) {
		this.grossSalary *= 1+(percentage/100);
	}
}
