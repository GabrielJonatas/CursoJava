package entities;

public class ContaBancaria {
	private String clientName;
	private int acccounNumber;
	private double cash = 0;
	
	public ContaBancaria(String name,int accountNumber){
		this.clientName = name;
		this.acccounNumber = accountNumber;
	}
	
	public ContaBancaria(String name,int accountNumber,double initialCash) {
		this.clientName = name;
		this.acccounNumber = accountNumber;
		// this.cash = initialCash;
		deposit(initialCash);
	}
	
	public String getClientName() {
		return this.clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public int getAcccounNumber() {
		return this.acccounNumber;
	}

	public double getCash() {
		return this.cash;
	}

	public void deposit(double cash) {
		this.cash += cash;
	}
	
	public void withdraw(double cash) {
		this.cash -= cash + 5.00;
	}	
	
	public String toString() {
		return "Account " 
				+ this.acccounNumber 
				+ ", Holder: " 
				+ this.clientName 
				+ ", Balance: $ " 
				+ String.format("%.2f", this.cash);
	}
}
