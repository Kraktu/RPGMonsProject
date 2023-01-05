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

	// création du premier et demie, Bruno humain

	Ennemi bruno = new Ennemi("Bruno",

	// La race

	new Race("humain",
	"C'est un humain",
	new StatistiqueBonus(2), //Stat Force
	new StatistiqueBonus(5), //Stat Intelligence
	new StatistiqueBonus(3),// Stat Agilite
	new StatistiqueBonus(2),// Stat dexterite
	new StatistiqueBonus(3)// Stat Constitution
	),

	// Classe

	new Classe("Voleur",
	"C'est un voleur",
	new StatistiqueBonus(2),// Stat Force
	new StatistiqueBonus(5),// Stat Intelligence
	new StatistiqueBonus(5),// Stat Agilite
	new StatistiqueBonus(3),// Stat Dexterite
	new StatistiqueBonus(4), // Stat Constitution

	// Sort de la Classe
	
	new Sort(null, null, 0, 0, 0, 0, false)),

	1, // Niveau

	1, // Vie

	2,// mana

	new StatistiqueBonus(2),// Stat Force
	new StatistiqueBonus(5),// Stat Intelligence
	new StatistiqueBonus(5),// Stat Agilite
	new StatistiqueBonus(3),// Stat Dexterite
	new StatistiqueBonus(4), // Stat Constitution

	// Armes

	new Arme("Couteau",
	
	"ça coupe",

	"Pas rare",

	0,// Prix

	new StatistiqueBonus(2),// Stat Force
	new StatistiqueBonus(1),// Stat Intelligence
	new StatistiqueBonus(3),// Stat Agilite
	new StatistiqueBonus(3),// Stat Dexterite
	new StatistiqueBonus(2), // Stat Constitution

	"arme blanche",// Type

	1,// Degat minimum

	2// degat maximum
	),

	// équipement

	new Equipement("Couteau",
	
	"ça coupe",

	"Pas rare",

	0,// Prix

	new StatistiqueBonus(2),// Stat Force
	new StatistiqueBonus(1),// Stat Intelligence
	new StatistiqueBonus(3),// Stat Agilite
	new StatistiqueBonus(3),// Stat Dexterite
	new StatistiqueBonus(2) // Stat Constitution
	
	)
	);

	// Getters :

	public Ennemi GetBruno() {
		return bruno;
	}

	// Setters :


	public void SetBruno(Ennemi _bruno) {
		bruno = _bruno;
	}
}