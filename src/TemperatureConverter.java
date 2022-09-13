import javax.swing.JOptionPane;

public class TemperatureConverter extends Converter {
	
	String[] operationOptions = {"Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit"};
	Double result;
	
	@Override
	public void showInput() {
		super.showInput();
	}
	
	@Override
	public void showConvertionOptions() {
		String input = (String) JOptionPane.showInputDialog(null, "Elije la temperatura  que quieres convertir", "Convertidor", JOptionPane.QUESTION_MESSAGE, null, this.operationOptions, "Convertir temperatura");
		this.convertData(input); //Execute operation method
	}

	@Override
	public void convertData(String userInput) {
		
		ConvertTemperatureOperations operation = new ConvertTemperatureOperations();
		
		switch (userInput) {
		case "Celsius a Fahrenheit":
			this.result = operation.celsiusToFahren(super.getValue());
			JOptionPane.showMessageDialog(null, "Son " + this.result + " grados Fahrenheit");
			break;
		case "Celsius a Kelvin":
			this.result = operation.celsiusToKelvin(super.getValue());
			JOptionPane.showMessageDialog(null, "Son " + this.result + " grados Kelvin");
			break;
		case "Fahrenheit a Celsius":
			this.result = operation.fahrenToCelsius(super.getValue());
			JOptionPane.showMessageDialog(null, "Son " + this.result + " grados Celsius");
			break;
		case "Fahrenheit a Kelvin":
			this.result = operation.fahrenToKelvin(super.getValue());
			JOptionPane.showMessageDialog(null, "Son " + this.result + " grados Kelvin");
			break;
		case "Kelvin a Celsius":
			this.result = operation.kelvinToCelsius(super.getValue());
			JOptionPane.showMessageDialog(null, "Son " + this.result + " grados Celsius");
			break;
		case "Kelvin a Fahrenheit":
			this.result = operation.kelvinToFahren(super.getValue());
			JOptionPane.showMessageDialog(null, "Son " + this.result + " grados Fahrenheit");
			break;
		default:
			break;
		}
		
		super.showContinueMessage();
	}
	
}
