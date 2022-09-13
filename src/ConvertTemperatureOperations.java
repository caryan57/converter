
public class ConvertTemperatureOperations {
	public double celsiusToFahren(double value) {
		return Math.round(((1.8 * value) + 32) * 100.00) / 100.00;
	}
	
	public double celsiusToKelvin(double value) {
		return Math.round((value + 273.15) * 100.00) / 100.00;
	}
	
	public double fahrenToCelsius(double value) {
		return Math.round(((value - 32) * 0.55) * 100.00) / 100.00;
	}
	
	public double fahrenToKelvin(double value) {
		return Math.round(((value - 32) * 0.55 + 273.15) * 100.00) / 100.00; 
	}
	
	public double kelvinToCelsius(double value) {
		return Math.round((value - 273.15) * 100.00) / 100.00;
	}
	
	public double kelvinToFahren(double value) {
		return Math.round(((value - 273.15) * 0.55 + 32) * 100.00) / 100.00;
	}
}
