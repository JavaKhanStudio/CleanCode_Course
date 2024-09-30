package exo2.examen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

public class Main {
   
	
	public static void main(String[] args) {
        voterPourLoi("Loi sur l'�ducation", 3);
    }

    private static void voterPourLoi(String nomLoi, int nombreAmendements) {
        System.out.println("Début du processus de vote pour la " + nomLoi);

        Faker faker = new Faker() ; 
        Random random = new Random();

        ArrayList<Amendement> amendements = new ArrayList<Amendement>() ;
        
        List<Senateur> senateurs = new ArrayList<>();

        senateurs.add(new Senateur("Victor Hugo", "Parti Républicain", 1876, "D�fenseur des droits et de la liberté"));
        senateurs.add(new Senateur("Georges Clemenceau", "Parti Radical", 1902, "Promoteur de la République et de ses valeurs"));
        senateurs.add(new Senateur("Alphonse de Lamartine", "Parti Libéral", 1852, "Poête et homme politique engagé"));
        senateurs.add(new Senateur("L�on Gambetta", "Parti Républicain", 1879, "Figure clé de la Troisième République"));
        
        String[] domaines = {"économique", "Environnemental", "Social", "éducatif", "Technologique"};
        
        
        for (int i = 0; i < nombreAmendements; i++) {
        	Amendement amendement = new Amendement() ; 
        	
        	 String domaine = domaines[faker.random().nextInt(domaines.length)]; 
             String sujet = faker.lorem().words(1).get(0); 
             String nomAmendement = "Amendement " + domaine + " sur " + sujet;
  
        	amendement.nom =  nomAmendement ;
        	amendement.texte = faker.lorem().sentence() ; 
        	amendement.passe = null ; 
        	
        	amendements.add(amendement) ;
        }

        int votesPour = 0;
        int votesContre = 0;
        
        int amendementPour = 0;
        int amendementContre = 0;
        
        for (Iterator iterator = amendements.iterator(); iterator.hasNext();) {
			Amendement amendement = (Amendement) iterator.next();
			 for (int tour = 1; tour <= 3; tour++) {
				 	votesPour = 0;
		            votesContre = 0;
		            System.out.println("Tour de vote " + tour + " pour l'amendement " + amendement.nom);
		            
		            for (Senateur senateur : senateurs) {
		            	boolean sonVote = random.nextBoolean();
		            	
		            	if(sonVote) 
		            	{
		            		votesPour++;
		            		senateur.votePour++ ;
		            	}	
	            		else {
	            			votesContre++ ;
	            			senateur.voteContre++ ;
	            		}	
					}
		            
		            if (votesPour > votesContre) {
		                System.out.println("L'amendement " + amendement.nom + " a �t� adopt�e avec "  + votesPour + " votes pour et " + votesContre + " votes contre.");
		                amendement.passe = true;
		                amendementPour++ ; 
		                break ;
		            }
		            else {
		            	System.out.println("L'amendement " + amendement.nom + " n'a pas �t� adopt�e avec " + votesPour + " votes pour et " + votesContre + " votes contre.");
		                amendement.passe = false;
		            }
		       }
			 
			 if(amendement.passe == null || !amendement.passe) {
				 amendement.passe = false;
				 amendementContre++ ; 
			 }
		}
        
        
       

        if (amendementPour >= amendementContre) {
        	System.out.println("La loi " + nomLoi + " a �t� adopt�e!");
        } else {
        	 System.out.println("La loi " + nomLoi + " n'a pas �t� adopt�e :(");
        }
        
        
        for (Senateur senateur : senateurs) {
			System.out.println("Le senateur " + senateur.nom + " du partie " + senateur.partiPolitique + " elu en " + senateur.anneeElection + " a vote " + senateur.votePour + " fois oui et " + senateur.voteContre + " fois contre" );
        }
    }

		
}

class Amendement {
	String nom ;
	String texte ;
	Boolean passe ; 
}

class Senateur {
	String nom;
	String partiPolitique ;
	String descriptionMandat; 
	int anneeElection ;
	int votePour; 
	int voteContre ;
	
	public Senateur(String nom, String partiPolitique, int anneeElection, String descriptionMandat) {
		super();
		this.nom = nom;
		this.partiPolitique = partiPolitique;
		this.anneeElection = anneeElection;
		this.descriptionMandat = descriptionMandat ;
	} 
	
}

