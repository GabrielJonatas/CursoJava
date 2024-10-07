package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee (int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		this.salary *= 1.0 + percentage/100.0; 
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
