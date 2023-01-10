package proto;

import proto.Stat.StatistiqueBonus;

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

	// déclaration des tableaux de String :

	String[] tempChoixPossible = {"Sautter au dessus", "Contourner le trou", "Ne pas prendre de risque"};

	String[] typeDeMalus = {"testMalus"};

	String[] typeDeRecompenses = {"testTypeRecompense"};

	// déclaration des tableaux int :

	int[] valeurMalus ={1, 1, 3};

	int[] valeurRecompense = {4, 4, 0};

	Challenge pontEnRuine = new Challenge("Pont en ruine",

	"C'est un pont",

	"Par défaut",

	tempChoixPossible,

	typeDeMalus,
	
	typeDeRecompenses,

	new StatistiqueBonus(0), // Stat Force

	new StatistiqueBonus(1),// Stat Intelligence

	new StatistiqueBonus(3),// Stat Agilité

	new StatistiqueBonus(1),// Stat Dextérité

	new StatistiqueBonus(0),// Stat Constitution

	0,// Niveau

	0,// Expérience par niveau

	1,// Expérience bonus par niveau

	valeurMalus,

	valeurRecompense,
	
	null// Equipement
	
	);

	// Getters :

	public Challenge GetPontEnRuine(){

		return pontEnRuine;
	
	}

	// Setters :

	public void SetPontEnRuine(Challenge _pontEnRuine){

		pontEnRuine = _pontEnRuine;

	}
}