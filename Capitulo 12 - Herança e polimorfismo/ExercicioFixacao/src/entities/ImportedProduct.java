package entities;

public class ImportedProduct extends Product {
	private Double customFee;
	
	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName() + " $ " + String.format("%.2f", this.totalPrice()));
		sb.append(" (Customs fee: $ " + String.format("%.2f",customFee) + ")");
		return sb.toString();
	}
	
	public Double totalPrice() {
		return this.getPrice() + this.getCustomFee();
	}
}
