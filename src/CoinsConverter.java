import javax.swing.JOptionPane;

public class CoinsConverter extends Converter {
	
	String[] operationOptions = {"Peso a Dolar", "Peso a Euros", "Peso a Libras Esterlinas", "Peso a Yen Japones", "Peso a Won Coreano", "Dolar a Peso", "Euros a Peso", "Libras Esterlinas a Peso", "Yen Japones a Peso", "Won Coreano a Peso"};
	Double result;
	
	@Override
	public void showInput() {
		super.showInput();
	}
	
	@Override
	public void showConvertionOptions() {
		String input = (String) JOptionPane.showInputDialog(null, "Elije la moneda que quieres convertir", "Convertidor", JOptionPane.QUESTION_MESSAGE, null, this.operationOptions, "Convertir monedas");
		this.convertData(input); //Execute operation method
	}

	@Override
	public void convertData(String userInput) {
		Coins currency = new Coins(); //currency
		ConvertCoinsOperations operation = new ConvertCoinsOperations(); //operation
		
		//local(mxn) to foreing currency
		switch (userInput) {
		case "Peso a Dolar":
			this.result = operation.localToForeignCurrency(super.getValue(), currency.usd);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " dólares");
			break;
		case "Peso a Euros":
			this.result = operation.localToForeignCurrency(super.getValue(), currency.euro);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " euros");
			break;
		case "Peso a Libras Esterlinas":
			this.result = operation.localToForeignCurrency(super.getValue(), currency.pound);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " libras esterlinas");
			break;
		case "Peso a Yen Japones":
			this.result = operation.localToForeignCurrency(super.getValue(), currency.yen);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " yenes");
			break;
		case "Peso a Won Coreano":
			this.result = operation.localToForeignCurrency(super.getValue(), currency.won);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " wones");
			break;
		default:
			break;
		}
		
		//foreing currency to local(mxn)
		switch (userInput) {
		case "Dolar a Peso":
			this.result = operation.ForeignCurrencyToLocal(super.getValue(), currency.usd);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " pesos");
			break;
		case "Euros a Peso":
			this.result = operation.ForeignCurrencyToLocal(super.getValue(), currency.euro);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " pesos");
			break;
		case "Libras Esterlinas a Peso":
			this.result = operation.ForeignCurrencyToLocal(super.getValue(), currency.pound);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " pesos");
			break;
		case "Yen Japones a Peso":
			this.result = operation.ForeignCurrencyToLocal(super.getValue(), currency.yen);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " pesos");
			break;
		case "Won Coreano a Peso":
			this.result = operation.ForeignCurrencyToLocal(super.getValue(), currency.won);
			JOptionPane.showMessageDialog(null, "Usted tiene " + this.result + " pesos");
			break;

		default:
			break;
		}
		
		super.showContinueMessage();
	}
	
}
