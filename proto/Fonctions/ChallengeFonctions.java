package proto.Fonctions;
//Créé par bruno
import proto.TousLesChallenges;
import proto.lesPersonnagesEnCombat;

public class ChallengeFonctions {

	// Création de variables de tableau String :

	private String[] tableauChoixPossible = TousLesChallenges.GetInstance().GetPontEnRuine().GetChoixPossible();

	private String[] tableauTypeDeMalus = TousLesChallenges.GetInstance().GetPontEnRuine().GetTypeDeMalus();

	private String[] tableauTypeDeRecompense = TousLesChallenges.GetInstance().GetPontEnRuine().GetTypeDeRecompense();

	// Création de variables de tableau int :

	private int[] tableauValeurMalus = TousLesChallenges.GetInstance().GetPontEnRuine().GetValeurMalus();

	private int[] tableauvaleurRecompense = TousLesChallenges.GetInstance().GetPontEnRuine().GetValeurRecompense();

	public void PrintDescriptionChallenge(lesPersonnagesEnCombat _lesPerso){

	//	int _pointDeVieRestantDuJoueur = 0;

	//	Joueur joueur = _lesPerso.GetLePersonnageJouable();

		System.out.println("Parfait " + _lesPerso.GetLePersonnageJouable().GetNom() +
		
		"\nVous avez décidé de faire un challenge\n" +

		"Pas de chance, c'est " + TousLesChallenges.GetInstance().GetPontEnRuine().GetNom() + " !!\n" +
		
		"Plusieurs choix s'offrent à vous ! Les voicis :\n" +

		tableauChoixPossible[0] + ",\n" +

		tableauChoixPossible[1] + " ou\n" +

		tableauChoixPossible[2] + "\n" +

		"Voici vos choix possibles ainsi que les points gagnés, mais évidemment ceux perdus !\n" +

		"1) Désignation des choix, challenges et points perdus probable :\n" +

		tableauTypeDeMalus[0] +

		tableauValeurMalus[0] + " points de vie !!\n" +

		tableauTypeDeMalus[1] + tableauValeurMalus[1] + " points de vie !!\n" +

		tableauTypeDeMalus[2] + tableauValeurMalus[2] + " points de vie !!\n" +

		"2) Désignation des choix, challenges et points gagnés probable :\n" +

		tableauTypeDeRecompense[0] +

		tableauvaleurRecompense[0] + " points de vie !!\n" +

		tableauTypeDeRecompense[1] +

		tableauvaleurRecompense[1] + " points de vie !!\n" +

		tableauTypeDeRecompense[2] +

		tableauvaleurRecompense[2] + " points de vie !!\n"
		);

	}
}