package exo1.meteo;

import java.util.ArrayList;
import java.util.List;

public class MeteoUtils {

	// Calcule la moyenne 
	public static double avg(List<Integer> a) {
	    int s = 0;
	    for (int n : a) {
	        s += n;
	    }
	    return a.isEmpty() ? 0 : (double) s / a.size();
	}

	// Permet de calculer des fahrenheit
	public static double fahrenheit(double c) {
	    return (c * 9/5) + 32;
	}

	public static int tMax(List<Integer> a) {
	    if (a == null || a.size() == 0) {
	        throw new IllegalArgumentException("Le tableau ne peut pas etre vide ou null.");
	    }
	    int max = a.get(0);
	    for (int v : a) {
	        if (v > max) {
	            max = v;
	        }
	    }
	    return max;
	}
	
	public static String regarderLaTemperature(int currentTime) {
		
		String valeur ; 
		switch (currentTime) {
			case 1 -> valeur = "Il fait beau !" ;
			case 2 -> valeur = "Il fait trop moche !" ;
			case 3 -> valeur = "Il pleut des bebe singes !" ;
			case 4 -> valeur = "Il fait un temps indefini !" ;
			default -> valeur = "Je ne sais pas";
		}
		
		return valeur ; 
		
	}

	public static List<Integer> prem(int limite) {
	    List<Integer> nombres = new ArrayList<>();
	    for (int i = 2; i <= limite; i++) {
	        if (isP(i)) {
	            nombres.add(i);
	        }
	    }
	    return nombres;
	}

	// Permet de savoir si un nombre est premier
	private static boolean isP(int nombre) {
	    for (int i = 2; i <= nombre / 2; i++) {
	        if (nombre % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	
	
}
