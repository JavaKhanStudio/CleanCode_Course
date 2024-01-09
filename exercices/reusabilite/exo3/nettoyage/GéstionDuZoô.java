package exo3.nettoyage;

import java.util.HashMap;
import java.util.Map;

public class GéstionDuZoô {

	private Map<String, Integer> ânimaux = new HashMap<>();

	public GéstionDuZoô() {
		ânimaux.put("Léopard", 5);
		ânimaux.put("Éléphant", 2);
		ânimaux.put("Giràfe", 4);
	}

	public void addÂnimal(String nom, int quantité) {
		if (ânimaux.containsKey(nom)) {
			ânimaux.put(nom, ânimaux.get(nom) + quantité);
		} else {
			ânimaux.put(nom, quantité);
		}
	}

	public void showÂnimaux() {
		for (Map.Entry<String, Integer> entrée : ânimaux.entrySet()) {
			System.out.println("Ânimal: " + entrée.getKey() + ", Quantité: " + entrée.getValue());
		}
	}

	public static void main(String[] args) {
		GéstionDuZoô zoo = new GéstionDuZoô();
		zoo.addÂnimal("Lion", 3);
		zoo.showÂnimaux();
	}
}
