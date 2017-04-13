import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input;
		double valorInicial = 0;
		double taxa = 0;
		int periodo = 0;
		double juros = 0;
		int tipoDeJuros = 0;

		System.out.println("Digite Valor Inicial");
		input = scanner.nextLine();
		valorInicial = Double.parseDouble(input);

		System.out.println("Digite a taxa em %:");
		input = scanner.nextLine();
		taxa = (Double.parseDouble(input)) / 100;

		System.out.println("Digite o período");
		periodo = scanner.nextInt();

		System.out.println("Digite 1 para Juros Simples e 2 para Juros Compostos");
		tipoDeJuros = scanner.nextInt();

		if (tipoDeJuros == 1) {
			juros = CalculadoraDeJuros.calcularJurosSimples(valorInicial, taxa, periodo);
		}
		if (tipoDeJuros == 2) {
			juros = CalculadoraDeJuros.calcularJurosCompostos(valorInicial, taxa, periodo);

		}

		System.out.println(juros);

	}

}