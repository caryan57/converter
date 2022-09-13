import javax.swing.JOptionPane;

public class ConverterOptions {
	String[] options = {"Conversor de Moneda", "Conversor de Temperatura"};
	String userSelection;
	
	public String showConvertersOptions() {
		String input = (String) JOptionPane.showInputDialog(null, "Elije un tipo de conversor", "Convertidor", JOptionPane.QUESTION_MESSAGE, null, this.options, "Convertir monedas");
		return this.userSelection = input;
	}
}
