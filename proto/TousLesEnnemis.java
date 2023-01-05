package proto;

/**
 * TousLesEnnemis Créé par Bruno
 * Base de données des ennemis 
 */
/*
	string nom;

Race race;

Classe classe;

int niveau;

int vie;

int mana;

Statistique force;

Statistique intelligence;

Statistique agilite;

Statistique dexterite;

Statistique constitution;

Arme arme;

Equipement equipement [] possibleLoot;
*/

public final class TousLesEnnemis{

	private static TousLesEnnemis instance;

	// Constructeur privé :

	private TousLesEnnemis() {

	}

	public static TousLesEnnemis getInstance() {

		if (instance == null) {
			instance = new TousLesEnnemis();
		}
		return instance;
	}

	// création du premier ennemie, Bruno humain

	Ennemi bruno = new Ennemi("Bruno",

	// Les races

	ToutesLesRaces.GetInstance().humain,

	// Classe

	ToutesLesClasses.GetInstance().voleur,

	1, // Niveau

	1, // Vie

	2,// mana

	new StatistiqueBonus(2),// Stat Force
	new StatistiqueBonus(5),// Stat Intelligence
	new StatistiqueBonus(5),// Stat Agilite
	new StatistiqueBonus(3),// Stat Dexterite
	new StatistiqueBonus(4), // Stat Constitution

	// Armes

	Arsenal.GetInstance().dague,

	// équipement

	null
	);

	// Getters :

	// Setters :

	
}