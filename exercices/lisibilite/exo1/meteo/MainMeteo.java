package exo1.meteo;

import java.util.Arrays;
import java.util.List;

public class MainMeteo {

	public static void main(String[] args) {
		List<Integer> temperaturesCelsius = Arrays.asList(12, 14, 13, 15, 16, 15, 14);
		double moyenneCelsius = MeteoUtils.avg(temperaturesCelsius);
		double moyenneFahrenheit = MeteoUtils.fahrenheit(moyenneCelsius);

		int tempMaxCelsius = MeteoUtils.tMax(temperaturesCelsius);
		List<Integer> nombresPremiers = MeteoUtils.prem(tempMaxCelsius);

		// Afficher ou enregistrer les résultats
		System.out.println("Temperature moyenne (Celsius): " + moyenneCelsius);
		System.out.println("Temperature moyenne (Fahrenheit): " + moyenneFahrenheit);
		System.out.println("Temperature maximale (Celsius): " + tempMaxCelsius);
		System.out.println("Nombres premiers jusqu'a la temperature maximale: " + nombresPremiers);

	}
	
	
	
	
}
