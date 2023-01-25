package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		
		double fahrenheit = 0;
		final double x = 32;
		final double divisor = 5.0 / 9.0;
		
		System.out.println(" Informe a temperatura em Fahrenheit");
		fahrenheit = sc.nextDouble();
		
		double temperaturaEmCelsius = (fahrenheit - x) * divisor;
		
		System.out.printf(" A temperatura em Celsius é: %.2f" + "°C", temperaturaEmCelsius);

		sc.close();
	}
}
