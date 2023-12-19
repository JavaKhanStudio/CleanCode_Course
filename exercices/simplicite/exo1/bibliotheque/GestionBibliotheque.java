package exo1.bibliotheque;


import java.util.HashMap;
import java.util.Map;

public class GestionBibliotheque {

    public static void main(String[] args) {
        Map<String, Integer> stockLivres = new HashMap<>();
        stockLivres.put("Le Petit Prince", 5);
        stockLivres.put("1984", 3);
        stockLivres.put("Le Seigneur des Anneaux", 2);
        stockLivres.put("Pique-nique au bord du chemin", 1);
        stockLivres.put("L'Histoire sans fin", 3);
        stockLivres.put("La Cité des Damnés", 1);
        stockLivres.put("Solaris", 4);
        stockLivres.put("Fahrenheit 451", 2);

        Map<String, Map<String, Integer>> emprunts = new HashMap<>();
        emprunts.put("Alice", new HashMap<>());
        emprunts.get("Alice").put("Le Petit Prince", 1);
        emprunts.get("Alice").put("La Petite Princesse", 1);
        emprunts.get("Alice").put("Le Petit Duc", 1);
        emprunts.put("Bob", new HashMap<>());
        emprunts.get("Bob").put("1984", 1);
        emprunts.put("Charlie", new HashMap<>());
        emprunts.get("Charlie").put("Le Seigneur des Anneaux", 2);
        emprunts.put("Danielle", new HashMap<>());
        emprunts.get("Danielle").put("L'Histoire sans fin", 1);
        emprunts.put("Éric", new HashMap<>());
        emprunts.get("Éric").put("Fahrenheit 451", 1);
        emprunts.put("Fanny", new HashMap<>());
        emprunts.get("Fanny").put("Solaris", 2);
        emprunts.put("Gustave", new HashMap<>());
        emprunts.get("Gustave").put("La Cité des Damnés", 1);
        emprunts.get("Gustave").put("La Cité de la peur", 1);
        emprunts.get("Gustave").put("La Cité des appeurés", 1);

        gererBibliotheque(stockLivres, emprunts);
    }

    private static void gererBibliotheque(Map<String, Integer> stockLivres, Map<String, Map<String, Integer>> emprunts) {
        System.out.println("Bienvenue à la bibliothèque!");
        
        System.out.println("Liste des livres disponibles et leur quantité :");
        for (Map.Entry<String, Integer> livre : stockLivres.entrySet()) {
            System.out.println("- " + livre.getKey() + ": " + livre.getValue() + " exemplaires");
        }

        System.out.println("Enregistrement des emprunts...");
        for (Map.Entry<String, Map<String, Integer>> emprunt : emprunts.entrySet()) {
            System.out.print(emprunt.getKey() + " a emprunté ");
            emprunt.getValue().forEach((titre, quantite) -> System.out.print(titre + " (" + quantite + "), "));
            System.out.println();
        }

        System.out.println("Vérification des stocks de livres...");
        for (Map.Entry<String, Integer> livre : stockLivres.entrySet()) {
            if (livre.getValue() < 2) {
                System.out.println("Alerte: Stock faible pour " + livre.getKey());
            }
        }

        System.out.println("Mise à jour des emprunts...");
        for (Map.Entry<String, Map<String, Integer>> emprunt : emprunts.entrySet()) {
            int totalEmprunte = emprunt.getValue().values().stream().mapToInt(Integer::intValue).sum();
            if (totalEmprunte > 2) {
                System.out.println("Alerte: " + emprunt.getKey() + " a emprunté plus de 2 livres!");
            }
        }

        System.out.println("Gestion terminée.");
    }
}
