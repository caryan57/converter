import javax.swing.JOptionPane;

abstract class Converter {
	protected String inputValue;
	private double value;
	
	public void start() {
		ConverterOptions userConverterSelection = new ConverterOptions();
		String selection = userConverterSelection.showConvertersOptions();
		
		if(selection == "Conversor de Moneda") {
			CoinsConverter coinsConverter = new CoinsConverter();
			coinsConverter.showInput();
		} else if (selection == "Conversor de Temperatura") {
			TemperatureConverter temperatureConverter = new TemperatureConverter();
			temperatureConverter.showInput();
		}
	}

	public void showInput() {
		this.inputValue = JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir");
		this.convertValueToDouble();
	};

	public void convertValueToDouble() {
		try {
			double input = Double.parseDouble(this.inputValue);
			this.value = input;

			this.showConvertionOptions();
		} catch (NullPointerException ex) {
			ConverterOptions userConverterSelection = new ConverterOptions();
			String selection = userConverterSelection.showConvertersOptions();
			
			if(selection == "Conversor de Moneda") {
				CoinsConverter coinsConverter = new CoinsConverter();
				coinsConverter.showInput();
			} else if (selection == "Conversor de Temperatura") {
				TemperatureConverter temperatureConverter = new TemperatureConverter();
				temperatureConverter.showInput();
			}
			
		} catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Dato inválido, vuelva a intentarlo");
			this.showInput();
		}
	}

	public double getValue() {
		return this.value;
	}

	public abstract void showConvertionOptions();

	public abstract void convertData(String userInput);
	
	public void showContinueMessage() {
		int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar?"); //0=yes, 1=no, 2=cancel
		
		if(confirm == 0) {
			this.start();
		} else {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
	}
}
