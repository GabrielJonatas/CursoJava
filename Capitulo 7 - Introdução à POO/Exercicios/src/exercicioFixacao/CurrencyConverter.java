package exercicioFixacao;

public class CurrencyConverter {
	private static final double IOF = 0.06;
	
	public static double dolarConverter(double price, double quantity) {
		return price*quantity*(1+IOF);
	}
}
