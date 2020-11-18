package Algo;

public class Nb_Secret {

	public static void main(String[] args) {
		
		int NbEssaie, NbSecret, NbJoueur;
	  	
		System.out.println("    Bienvenue c'est parti pour jouer !");
		System.out.println();
		System.out.println();
		
	  	NbSecret = Saisie.lire_int("Entrez votre nombre secret entre 1 et 100");
	  	
	  	System.out.println();
	  	
	  	NbJoueur = Saisie.lire_int("Essayez de deviner le nombre secret entre 1 et 100 ");
	  	
	  	for ( NbEssaie = 1; NbEssaie < 10;)
	 	 {
	 	 	if (NbSecret < 	NbJoueur) 
	 	 		{
	 	 		System.out.println("C'est trop haut. ");
	 	 		
	 	 		System.out.println();
	 	 		
	 	 		NbJoueur = Saisie.lire_int("Réessaie de deviner le nombre secret entre 1 et 100");
	 	 		}
	 	 	
	 	 		else if (NbSecret > NbJoueur)
	 	 			{
	 	 			System.out.println("Oups trop bas !");
	 	 			
	 	 			System.out.println();
	 	 			
	 	 			NbJoueur = Saisie.lire_int("Réessaie de deviner le nombre secret entre 1 et 100");
	 	 			} 
	 	 			
	 	 			else {
	 	 				System.out.println();
	 	 				System.out.println("Bravo vous avez trouver...");
	 	 				break;
	 	 			}

	 	 	NbEssaie++;
	 	 }
	  	
	  	
	  		System.out.println();
			System.out.println("Vous avez jouer en " + NbEssaie + " coups ! ");

	}

}
