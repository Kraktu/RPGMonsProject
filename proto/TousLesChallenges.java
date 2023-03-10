package proto;

import java.util.Arrays;
import java.util.List;

import proto.Stat.StatistiqueBonus;

/**
 * TousLesChallenges créé pa r Bruno
 * Bases de données des challenges
 */
 /*
 String nom,description,choixParDefaut;

	 Tableaux/ Liste de String

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

	// déclaration des tableaux/ Liste de String :

	String[] tempChoixPossible = {"Sautter au dessus", "Escalader le mur à côté du trou", "Ne pas prendre de risque"};

	List<String> listeChoixPossible = Arrays.asList(tempChoixPossible);

	String[] typeDeMalus = {"A : Si vous essayez de sauter au-dessus de celui-ci et que vous tombez dedans, vous perdrez ", "B : Si vous essayez d'escalader le mur à côté du trou et que vous tombez, vous perdrez ", "C : Si comme une poule mouillée, vous n'osez même pas jouer, vous perdrez "};

	List<String> listeTypeDeMalus = Arrays.asList(typeDeMalus);

	String[] typeDeRecompenses = {"A : Si magnifiquement vous sautez au-dessus du trou, vous gagnerez ", "B : Par contre, plus difficile ! Si vous escaladez grâce a votre courage l'obstacle, vous gagnerez ", "C : Comme vous n'osez même pas jouer, vous gagnerez "};

	List<String> listeTypeDeRecompense = Arrays.asList(typeDeRecompenses);

	// déclaration des tableaux int :

	private int[] valeurMalus = {2, 2, 1};

	int[] valeurRecompense = {4, 8, 0};

	Challenge pontEnRuine = new Challenge("Pont en ruine",

	"Celui-ci est très sinueux, un immense trou est présent et à cause de ceci on ne peut plus circuler normalement! Du coup…",

	"Par défaut",

	listeChoixPossible,

	listeTypeDeMalus,
	
	listeTypeDeRecompense,

	new StatistiqueBonus(0), // Stat Force

	new StatistiqueBonus(1),// Stat Intelligence

	new StatistiqueBonus(3),// Stat Agilité

	new StatistiqueBonus(4),// Stat Dextérité

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