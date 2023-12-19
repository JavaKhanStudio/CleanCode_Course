package exo2.bibliotheque;

import java.util.*;

public class BiblioUtils {

    private static Map<String, String> lv = new HashMap<>();
    private static Map<String, String> adh = new HashMap<>();
    private static Map<String, List<String>> emp = new HashMap<>();

    public static void ajL(String isbn, String titre) {
        lv.put(isbn, titre);
    }

    public static void ajA(String id, String nom) {
        adh.put(id, nom);
    }

    public static void empr(String id, String isbn) {
        if (!lv.containsKey(isbn) || !adh.containsKey(id)) {
            System.out.println("Erreur");
            return;
        }
        emp.computeIfAbsent(id, k -> new ArrayList<>()).add(isbn);
    }

    public static void afE() {
        for (Map.Entry<String, List<String>> e : emp.entrySet()) {
            System.out.println("Adhérent: " + adh.get(e.getKey()) + ", Livres: " + e.getValue());
        }
    }

    // Autres méthodes...
}
