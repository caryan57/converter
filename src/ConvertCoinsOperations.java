
public class ConvertCoinsOperations {
	
	public double localToForeignCurrency(double value, double currency) {
		return Math.round((value / currency) * 100.00) / 100.0; // round 2 decimals
	}
	
	public double ForeignCurrencyToLocal(double value, double currency) {
		return Math.round((value * currency) * 100.00) / 100.00;
	}
}
