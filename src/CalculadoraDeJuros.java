
public class CalculadoraDeJuros {

	public static double calcularJurosSimples(double valorInicial, double taxa, int periodo) {
		return valorInicial * taxa * periodo;
	}

	public static double calcularJurosCompostos (double valorInicial, double taxa, int periodo) {

		return valorInicial - ((Math.pow((1+taxa), periodo) / (valorInicial)));
	}

}