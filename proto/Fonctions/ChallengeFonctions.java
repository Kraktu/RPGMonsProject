package proto.Fonctions;
import java.util.List;

import proto.Joueur;
//Créé par bruno.
import proto.TousLesChallenges;
import proto.ToutesLesFonctions;
import proto.lesPersonnagesEnCombat;
//import proto.Stat.Statistique;

public class ChallengeFonctions {

	// Création de variables de tableau String :

	private List <String> tableauChoixPossible = TousLesChallenges.GetInstance().GetPontEnRuine().GetChoixPossible();

	private List<String> tableauTypeDeMalus = TousLesChallenges.GetInstance().GetPontEnRuine().GetTypeDeMalus();

	private List < String> tableauTypeDeRecompense = TousLesChallenges.GetInstance().GetPontEnRuine().GetTypeDeRecompense();

	// Création de variables de tableau int :

	private int[] tableauValeurMalus = TousLesChallenges.GetInstance().GetPontEnRuine().GetValeurMalus();

	private int[] tableauvaleurRecompense = TousLesChallenges.GetInstance().GetPontEnRuine().GetValeurRecompense();

			int _pointDeVieRestantDuJoueur = 0;

			int _agiliteJoueur = 0;

			int _dexteriteJoueur = 0;

	/**
	 * @param _lesPerso
	 */
	public void PrintDescriptionChallenge(lesPersonnagesEnCombat _lesPerso){

		EntreUtilisateur entreUtilisateur = ToutesLesFonctions.GetInstance().GetEntreUtilisateur();

			Joueur joueur = _lesPerso.GetLePersonnageJouable();

		System.out.println("Parfait " + joueur.GetNom() +
		
		"\nVous avez décidé de faire un challenge\n");

		entreUtilisateur.TexteQuiAttend("Plein de chance, c'est le " + TousLesChallenges.GetInstance().GetPontEnRuine().GetNom() + " !!\n");

		System.out.println(TousLesChallenges.GetInstance().GetPontEnRuine().GetDescription());

		entreUtilisateur.TexteQuiAttend("Plusieurs choix s'offrent à vous, mais, en fonction de ce que vous choisirez, vous aurez plus ou moins de point de vie ! Les voicis :\n");

		System.out.println(tableauTypeDeMalus.get(0) +

		tableauValeurMalus[0] + " points de vie !!\n" +

		tableauTypeDeMalus.get(1) +

		tableauValeurMalus[1] + " points de vie !!");

		entreUtilisateur.TexteQuiAttend(tableauTypeDeMalus.get(2) +

		tableauValeurMalus[2] + " points de vie !!\n");

		entreUtilisateur.TexteQuiAttend("Voici ce que vous gagnerez en cas de franchissement :\n");

		System.out.println(tableauTypeDeRecompense.get(0) +

		tableauvaleurRecompense[0] + " points de vie !!\n" +

		tableauTypeDeRecompense.get(1) +

		tableauvaleurRecompense[1] + " points de vie !!");

		entreUtilisateur.TexteQuiAttend(tableauTypeDeRecompense.get(2) +

		tableauvaleurRecompense[2] + " points de vie !!\n" +

		"Pour info, il vous reste " + joueur.GetVie() + " points de vie !!");

		int _choix3Proposition;

		do {

			_choix3Proposition = entreUtilisateur.EntreeUtilisateurInt("Que voulez-vous faire ?\n\n" +

			"Tapez 1 pour " + tableauChoixPossible.get(0) +

			".\nTapez 2 pour " + tableauChoixPossible.get(1) +

			".\nTapez 3 pour " + tableauChoixPossible.get(2) 		);

			switch (_choix3Proposition) {
				case 1:

					System.out.println("Très bien, vous avez choisi " + tableauChoixPossible.get(0) +

					".\nSuper ;) En cas de victoire, vous gagnerez " + tableauvaleurRecompense[0] + " point de vie !!" +

					"\nSuper ;) En cas de défaite, et ce sera le cas :-) vous perdrez " + tableauValeurMalus[0] + "Point de vie !!"

					);

					
					break;

					case 2:

					System.out.println("Très bien, vous avez choisi " + tableauChoixPossible.get(1) +

					".\nSuper ;) En cas de victoire, vous gagnerez " + tableauvaleurRecompense[1] + " point de vie !!" +

					"\nSuper ;) En cas de défaite, et ce sera le cas :-) vous perdrez " + tableauValeurMalus[1] + "Point de vie !!"

					);

					break;

					case 3:

					System.out.println("Très bien, vous avez choisi " + tableauChoixPossible.get(2) +

					".\nPetit trouillard !! Comme vous ne voulez même pas essayer le challenge, vous gagnerez " + tableauvaleurRecompense[2] + " point de vie !!" +

					"\nDu coup, vous perdrez " + tableauValeurMalus[2] + "Point de vie !!"

					);

					break;

				default:

				System.out.println("Vous devez uniquement mettre un chiffre entre 1 et 3 !!! Veuillez recommencer !!");
					break;
			}
		
		}
		while(_choix3Proposition > 3 || _choix3Proposition <= 0);

			int _agiliteJoueur = joueur.GetAgilite().GetValeur();

			int _agiliteNecessairePont = TousLesChallenges.GetInstance().GetPontEnRuine().GetAgiliteBonus().GetValeur();

			int _dexteriteJoueur = joueur.GetDexterite().GetValeur();

			int _dexteriteNecessairePont = TousLesChallenges.GetInstance().GetPontEnRuine().GetDexteriteBonus().GetValeur();

			_pointDeVieRestantDuJoueur = joueur.GetVie();

		if (_choix3Proposition == 1) {

			entreUtilisateur.TexteQuiAttend("Pour savoir sauter au-dessus du trou, vous avez besoin d'au moins " + _agiliteNecessairePont + " points d'agilité !!\n");

			System.out.println( "Il vous reste " + _agiliteJoueur + " points d'agilité !!");

			ScenarioChallengeSauter(_lesPerso, _agiliteNecessairePont, 0, 0);

		}
		
		else if (_choix3Proposition == 2) {

			entreUtilisateur.TexteQuiAttend("Pour pouvoir escalader le mur à côté du trou, vous avez besoin d'au moins " + _agiliteNecessairePont + " points d'agilités !! Mais aussi " + _dexteriteNecessairePont + " points de dextérité !!\n");

			System.out.println( "Il vous reste " + _agiliteJoueur + " points d'agilités, ainsi que " + _dexteriteJoueur + " points de dextérités !!");

			ScenarioChallengeEscalader(_lesPerso, _agiliteNecessairePont, _dexteriteNecessairePont, 1);
		}

		else if (_choix3Proposition == 3) {

			entreUtilisateur.TexteQuiAttend("Pour pouvoir contourner le trou, vous avez besoin de " + tableauValeurMalus[2] + " point de vie !!\n");

			 _pointDeVieRestantDuJoueur = (_pointDeVieRestantDuJoueur - tableauValeurMalus[2]);

			entreUtilisateur.TexteQuiAttend("Comme vous n'avez pas joué, il vous reste " + _pointDeVieRestantDuJoueur + " points de vie !!");

			 joueur.SetVie(_pointDeVieRestantDuJoueur);
		}
	}


	public void ScenarioChallengeSauter(lesPersonnagesEnCombat _lesPerso, int _agiliteNecessairePont, int _dexteriteNecessairePont, int _valeurTableau) {

		EntreUtilisateur entreUtilisateur = ToutesLesFonctions.GetInstance().GetEntreUtilisateur();

		Joueur joueur = _lesPerso.GetLePersonnageJouable();

		int _agiliteJoueur = joueur.GetAgilite().GetValeur();

		boolean egalite= false;
	
			while (!egalite) {

		entreUtilisateur.TexteQuiAttend("Bonne chance, les dés sont lancés…");

		int _jetResultat = entreUtilisateur.JetDeDeMax(1, _agiliteJoueur);

		entreUtilisateur.TexteQuiAttend("Agilité à battre : " + _agiliteNecessairePont + " points");

		entreUtilisateur.TexteQuiAttend("Résultat des dés : " + _jetResultat);

		if (_jetResultat > _agiliteNecessairePont) {

			_pointDeVieRestantDuJoueur = (_pointDeVieRestantDuJoueur + tableauvaleurRecompense[_valeurTableau]);

			entreUtilisateur.TexteQuiAttend("Vous avez réussi à franchir le pont, vous avez maintenant " + _pointDeVieRestantDuJoueur + " points de vies :-)");

			joueur.SetVie(_pointDeVieRestantDuJoueur);

			egalite = true;
		}

		else if (_jetResultat < _agiliteNecessairePont) {

			_pointDeVieRestantDuJoueur = (_pointDeVieRestantDuJoueur - tableauValeurMalus[_valeurTableau]);

			entreUtilisateur.TexteQuiAttend("Vous n'avez pas réussi à franchir le pont, vous avez maintenant " + _pointDeVieRestantDuJoueur + " points de vies :-)");

			joueur.SetVie(_pointDeVieRestantDuJoueur);

			if (_pointDeVieRestantDuJoueur <=0) {

				entreUtilisateur.TexteQuiAttend("GAME OVER");
			}

			egalite = true;
		}

		else if (_jetResultat == _agiliteNecessairePont) {

			entreUtilisateur.TexteQuiAttend("Les dés ont signalé une égalité, nous allons de nouveau les relancer ! Cliquer \"Enter\" pour continuer…");
		}

		else {

			System.out.println("Erreur de programme");
		}
	}
	}


	public void ScenarioChallengeEscalader(lesPersonnagesEnCombat _lesPerso, int _agiliteNecessairePont, int _dexteriteNecessairePont, int _valeurTableau) {

		EntreUtilisateur entreUtilisateur = ToutesLesFonctions.GetInstance().GetEntreUtilisateur();

		Joueur joueur = _lesPerso.GetLePersonnageJouable();

		int _agiliteJoueur = joueur.GetAgilite().GetValeur();

		int _dexteriteJoueur = joueur.GetDexterite().GetValeur();

		boolean egalite= false;
	
			while (!egalite) {

		entreUtilisateur.TexteQuiAttend(" les dés seront lancés quand vous appuierez sur la touche Enter ! Bonne chances ");

		int _jetResultat = entreUtilisateur.JetDeDeMax(1, _agiliteJoueur);

		int _jetResultatDexteriter = entreUtilisateur.JetDeDeMax(1, _dexteriteJoueur);

		entreUtilisateur.TexteQuiAttend("Agilité à battre : " + _agiliteNecessairePont + " points\n");

		entreUtilisateur.TexteQuiAttend("Dextérité à battre : " + _dexteriteNecessairePont + " points");

		entreUtilisateur.TexteQuiAttend("A : Résultat des dés pour l'agilité : " + _jetResultat +

		"\nB: Résultat des dés pour la dextérité : " + _jetResultatDexteriter);

		if (_jetResultat > _agiliteNecessairePont && _jetResultatDexteriter > _dexteriteNecessairePont) {

			_pointDeVieRestantDuJoueur = (_pointDeVieRestantDuJoueur + tableauvaleurRecompense[_valeurTableau]);

			entreUtilisateur.TexteQuiAttend("Vous avez réussi à escalader le mur du pont, vous avez maintenant " + _pointDeVieRestantDuJoueur + " points de vies :-)");

			joueur.SetVie(_pointDeVieRestantDuJoueur);

			egalite = true;
		}

		else if (_jetResultat < _agiliteNecessairePont || _jetResultatDexteriter < _dexteriteNecessairePont) {

			_pointDeVieRestantDuJoueur = (_pointDeVieRestantDuJoueur - tableauValeurMalus[_valeurTableau]);

			entreUtilisateur.TexteQuiAttend("Vous n'avez pas réussi à escalader le mur du pont, vous avez maintenant " + _pointDeVieRestantDuJoueur + " points de vies :-)");

			joueur.SetVie(_pointDeVieRestantDuJoueur);

			if (_pointDeVieRestantDuJoueur <=0) {

				entreUtilisateur.TexteQuiAttend("GAME OVER");
			}

			egalite = true;
		}

		else if (_jetResultat == _agiliteNecessairePont || _jetResultatDexteriter == _dexteriteNecessairePont) {

			entreUtilisateur.TexteQuiAttend("Les dés ont signalé une égalité, nous allons de nouveau les relancer ! Cliquer \"Enter\" pour continuer…");
		}

		else {

			System.out.println("Erreur de programme");
		}
	}
	}
	}