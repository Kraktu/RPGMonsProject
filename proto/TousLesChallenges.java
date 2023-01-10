package proto;

/**
 * TousLesChallenges créé pa r Bruno
 * Bases de données des challenges
 */
 /*
 String nom,description,choixParDefaut;

	 Tableaux de String

	String[] choixPossible;

	String[] typeDeMalus;

	String[] typeDeRecompense;

Statistique StatRequise;

int niveau,experienceBrute,experienceBonusParNiveau;

Tableaux D'int

int[] valeurMalus;

int[] valeurRecompense;;

Equipement[]
*/

public final class TousLesChallenges {

	private static TousLesChallenges instance;

	// Constructeur privé :

	private   TousLesChallenges() {


	}

	public static proto.TousLesChallenges GetInstance() {

		if (instance == null) {

			instance = new TousLesChallenges();
		}
		return instance;
	}

	// Création du 1er challenge :

	String[] tempChoixPossible = {"Sautter au dessus", "Contourner le trou", "Ne pas prendre de risque"};

	String[] typeDeMalus = {"testMalus"};
	
	String[] typeDeRecompenses = {"testTypeRecompense"};

	Challenge pontEnRuine = new Challenge("Pont en ruine",

	"C'est un pont",

	"Par défaut",

	tempChoixPossible,

	typeDeMalus,
	
	typeDeRecompenses,
	
	null,
	
	null,
	
	null,
	
	null,
	
	null,
	
	0,
	
	0,
	
	0,
	
	null,
	
	null,
	
	null
	
	);
}