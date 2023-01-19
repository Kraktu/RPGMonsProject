package proto.Fonctions;
import proto.Joueur;
//Créé par bruno.
import proto.TousLesChallenges;
import proto.ToutesLesFonctions;
import proto.lesPersonnagesEnCombat;
//import proto.Stat.Statistique;

public class ChallengeFonctions {

	// Création de variables de tableau String :

	private String[] tableauChoixPossible = TousLesChallenges.GetInstance().GetPontEnRuine().GetChoixPossible();

	private String[] tableauTypeDeMalus = TousLesChallenges.GetInstance().GetPontEnRuine().GetTypeDeMalus();

	private String[] tableauTypeDeRecompense = TousLesChallenges.GetInstance().GetPontEnRuine().GetTypeDeRecompense();

	// Création de variables de tableau int :

	private int[] tableauValeurMalus = TousLesChallenges.GetInstance().GetPontEnRuine().GetValeurMalus();

	private int[] tableauvaleurRecompense = TousLesChallenges.GetInstance().GetPontEnRuine().GetValeurRecompense();

	/**
	 * @param _lesPerso
	 */
	public void PrintDescriptionChallenge(lesPersonnagesEnCombat _lesPerso){

		EntreUtilisateur entreUtilisateur = ToutesLesFonctions.GetInstance().GetEntreUtilisateur();

			int _pointDeVieRestantDuJoueur = 0;

			Joueur joueur = _lesPerso.GetLePersonnageJouable();

		System.out.println("Parfait " + joueur.GetNom() +
		
		"\nVous avez décidé de faire un challenge\n");

		entreUtilisateur.TexteQuiAttend("Plein de chance, c'est le " + TousLesChallenges.GetInstance().GetPontEnRuine().GetNom() + " !!\n");

		System.out.println(TousLesChallenges.GetInstance().GetPontEnRuine().GetDescription());

		entreUtilisateur.TexteQuiAttend("Plusieurs choix s'offrent à vous, mais, en fonction de ce que vous choisirez, vous aurez plus ou moins de point de vie ! Les voicis :\n");

		System.out.println(tableauTypeDeMalus[0] +

		tableauValeurMalus[0] + " points de vie !!\n" +

		tableauTypeDeMalus[1] +

		tableauValeurMalus[1] + " points de vie !!");

		entreUtilisateur.TexteQuiAttend(tableauTypeDeMalus[2] +

		tableauValeurMalus[2] + " points de vie !!\n");

		entreUtilisateur.TexteQuiAttend("Voici ce que vous gagnerez en cas de franchissement :\n");

		System.out.println(tableauTypeDeRecompense[0] +

		tableauvaleurRecompense[0] + " points de vie !!\n" +

		tableauTypeDeRecompense[1] +

		tableauvaleurRecompense[1] + " points de vie !!");

		entreUtilisateur.TexteQuiAttend(tableauTypeDeRecompense[2] +

		tableauvaleurRecompense[2] + " points de vie !!\n" +

		"Pour info, il vous reste " + joueur.GetVie() + " points de vie !!");

		int _choix3Proposition;

		do {

			_choix3Proposition = entreUtilisateur.EntreeUtilisateurInt("Que voulez-vous faire ?\n\n" +

			"Tapez 1 pour " + tableauChoixPossible[0] +

			".\nTapez 2 pour " + tableauChoixPossible[1] +

			".\nTapez 3 pour " + tableauChoixPossible[2] + "."
			);

			switch (_choix3Proposition) {
				case 1:

					System.out.println("Très bien, vous avez choisi " + tableauChoixPossible[0] +

					".\nSuper ;) En cas de victoire, vous gagnerez " + tableauvaleurRecompense[0] + " point de vie !!" +

					"\nSuper ;) En cas de défaite, et ce sera le cas :-) vous perdrez " + tableauValeurMalus[0] + "Point de vie !!"

					);

					
					break;

					case 2:

					System.out.println("Très bien, vous avez choisi " + tableauChoixPossible[1] +

					".\nSuper ;) En cas de victoire, vous gagnerez " + tableauvaleurRecompense[1] + " point de vie !!" +

					"\nSuper ;) En cas de défaite, et ce sera le cas :-) vous perdrez " + tableauValeurMalus[1] + "Point de vie !!"

					);

					break;

					case 3:

					System.out.println("Très bien, vous avez choisi " + tableauChoixPossible[2] +

					".\nSuper ;) En cas de victoire, vous gagnerez " + tableauvaleurRecompense[2] + " point de vie !!" +

					"\nSuper ;) En cas de défaite, et ce sera le cas :-) vous perdrez " + tableauValeurMalus[2] + "Point de vie !!"

					);

					break;
			
				default:

				System.out.println("Vous devez uniquement mettre un chiffre entre 1 et 3 !!! Veuillez recommencer !!");
					break;
			}
		
		}
		while(_choix3Proposition > 3 || _choix3Proposition <= 0);

		System.out.println("Du coup, c'est parti !!");
	
			int _agilitePont = TousLesChallenges.GetInstance().GetPontEnRuine().GetAgiliteBonus().GetValeur();
	
			int _agiliteJoueur = _lesPerso.GetLePersonnageJouable().GetAgilite().GetValeur();

			_pointDeVieRestantDuJoueur = joueur.GetVie();

		if (_choix3Proposition == 1) {

			entreUtilisateur.TexteQuiAttend("Pour savoir franchir ceci vous avez besoin d' au moins " + _agilitePont + " points d'agilité !!\n");

			System.out.println( "Il vous reste " + _agiliteJoueur + " points d'agilité !!");

		System.out.println("Bonne chance, les dés sont lancés…");

		int _jetResultat = entreUtilisateur.JetDeDeMax(_agiliteJoueur);

		if (_jetResultat > _agilitePont) {

			int _res = (_pointDeVieRestantDuJoueur + tableauvaleurRecompense[0]);

			System.out.println("Vous avez réussi à franchir le pont, vous avez maintenant " + _res + " points de vies :-)");
		}

		else if (_jetResultat < _agilitePont) {

			System.out.println(_jetResultat + " Perdu");
		}

		else if (_jetResultat == _agilitePont) {

			System.out.println(_jetResultat + "Egalité");
		}

		else {

			System.out.println("Erreur de programme");
		}
		}
	}
}