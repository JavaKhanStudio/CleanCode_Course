package exo2.examen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Eleve> students = new ArrayList<>();
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivy", "Jack"};

        for (int i = 0; i < 10; i++) {
            Eleve student = new Eleve();
            student.nom = names[new Random().nextInt(names.length)];
            student.notes = new HashMap<>();
            
            for (Matiere matiere : Matiere.values()) {
                int score = new Random().nextInt(101);
                student.notes.put(matiere, score);
            }
            
            students.add(student);
        }
    }

}

class Eleve {
    String nom;
    HashMap<Matiere, Integer> notes;
    
    public Eleve()
    {}
    
	public Eleve(String nom, HashMap<Matiere, Integer> notes) {
		super();
		this.nom = nom;
		this.notes = notes;
	}
}

enum Matiere {
    JAVA,
    PYTHON,
    WEB,
    SQL,
    KUNG_FU,
    ANGLAIS,
    MATH,
}