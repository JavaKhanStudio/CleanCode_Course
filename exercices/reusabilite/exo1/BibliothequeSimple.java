package exo1;

public class BibliothequeSimple {

	// Exemple de code peu réutilisable
	public static void main(String[] args) {
        
        String[] livres = {"Le Petit Prince", "1984", "Le Seigneur des Anneaux"};
        for (String livre : livres) {
            System.out.println("Livre disponible : " + livre);
        }

        String[] membres = {"Alice", "Bob", "Charlie"};
        for (String membre : membres) {
            System.out.println("Membre de la bibliothèque : " + membre);
        }
    }
	
}
