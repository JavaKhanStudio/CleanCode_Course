package exo1;

public class BibliothequeSimple {

	// Exemple de code peu réutilisable
	public static void main(String[] args) {

		String[] livres = { "Le Petit Prince", "1984", "Le Seigneur des Anneaux" };
		String[] membres = { "Alice", "Bob", "Charlie" };
		String[] bandeDessinees = { "Aterix", "Mélusine", "Petit Tintin", "Grand Tintin" };

		for (String livre : livres) {
			System.out.println("Livre disponible : " + livre);
		}

		for (String membre : membres) {
			System.out.println("Membre de la bibliothèque : " + membre);
		}

		for (String bandeDessinee : bandeDessinees) {
			System.out.println("Bande dessinée disponible : " + bandeDessinee);
		}
	}

}
