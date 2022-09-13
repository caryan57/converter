
public class TestConverter {

	public static void main(String[] args) {
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
}
