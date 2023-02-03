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

int[] valeurRecompense;

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

	/*
	* Challenge Créé par Simon
	  */
	
	  	// déclaration des tableaux/ Liste de String :

	String[] tempChoixPossible = {"Se faufiler précotionneusement entre les mailles de la toile", "être impatient et forcer le passage comme un bourrin au risque de se laisser piéger", "Ne pas prendre de risque"};

	List<String> listeChoixPossible = Arrays.asList(tempChoixPossible);

	String[] typeDeMalus = {"A : Si vous restez coincé faute d'habileté, vous vous ferez bouffer sans trop souffrir, vous serez s@ûrement déjà mort de fatigue... ou de désespoir!!", "B : Si vous avez trop forcé et que vous êtes englué, l'arraignée se délectera et vous mangera très lentement car l'adrenaline humaine est tellement délicieuse= Bref vous mourrez dans d'atroces souffrances, trop chouete, non?", "C : Si comme une poule mouillée, vous n'osez même pas jouer... Eh bien il ne vaut mieux pas hésiter car l'arraignée vous regarde avec convoitise, prenez garde, elle arrive!"};

	List<String> listeTypeDeMalus = Arrays.asList(typeDeMalus);

	String[] typeDeRecompenses = {"A : Si vous avez été assez intelligent pour garder votre calme et franchir cet obstacle avec sagesse, vous pourrez vous féliciter d'avoir échapé à un grand péril et mieux encore, même l'arraignée vous regardera avec respect.", "B : Par contre, si, par chance, votre bourinnage a fonctionné espèce de chanceux, vous aurez réussi l'épreuve, mais, restez prudent, personne n'aime qu'on détruise sa maison", "C : Comme vous n'osez même pas jouer, vous restez en vie, mais quel déshonneur, votre manque de courage vous perdra un jour!"};

	List<String> listeTypeDeRecompense = Arrays.asList(typeDeRecompenses);

	// déclaration des tableaux int :

	private int[] valeurMalus = {2, 2, 1};

	Challenge toileArraignee= new Challenge("Toile d'arraignée", "Oups, une arraignée géante a tissé une toile bien gluante pour piéger ses proies. Heureusement, vue la taille de la bête, les mailles de la toiles sont sufisamment grandes pour se faufilier si l'on est assez agile.", "Idéalement, il vaut mieux se faufiler entre les mailles de la toile, mais attention, il faut toucher la toile le moins possible", listeChoixPossible, listeTypeDeMalus, listeTypeDeRecompense, 2, 4, 6, 6, 3, 0, 2, 1, 2, 4, null);
	// Getters :

	public Challenge GetPontEnRuine(){

		return pontEnRuine;
	
	}
	public Challenge GetToileArraignee() {
		return toileArraignee
		
	}

	// Setters :

	public void SetPontEnRuine(Challenge _pontEnRuine){

		pontEnRuine = _pontEnRuine;

	}
	public void SetToileArraignee() {
		toileArraignee
	}
}