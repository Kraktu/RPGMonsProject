package proto.Fonctions;
//Créé par bruno
import proto.TousLesChallenges;
import proto.lesPersonnagesEnCombat;

public class ChallengeFonctions {

	private String tableauxChoixPossible = TousLesChallenges.GetInstance().GetPontEnRuine().GetChoixPossible()[0];

	public void PrintDescriptionChallenge(lesPersonnagesEnCombat _lesPerso){

	//	int _pointDeVieRestantDuJoueur = 0;

	//	Joueur joueur = _lesPerso.GetLePersonnageJouable();

		System.out.println("Parfait " + _lesPerso.GetLePersonnageJouable().GetNom() +
		
		"\nVous avez décidé de faire un challenge\n" +

		"Pas de chance, c'est " + TousLesChallenges.GetInstance().GetPontEnRuine().GetNom() + " !!\n" +
		
		"Plusieurs choix s'offrent à vous ! Les voicis :\n" +

		tableauxChoixPossible);

	}
}