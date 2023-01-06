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


	// création du 2ème ennemi le rater qui est  un gobelin, 

	Ennemi leRater = new Ennemi("Le raté",

	// Les races

	ToutesLesRaces.GetInstance().gobelin,

	// Classe

	ToutesLesClasses.GetInstance().guerrier,

	1, // Niveau

	1, // Vie

	2,// mana

	new StatistiqueBonus(5),// Stat Force
	new StatistiqueBonus(1),// Stat Intelligence
	new StatistiqueBonus(1),// Stat Agilite
	new StatistiqueBonus(2),// Stat Dexterite
	new StatistiqueBonus(3), // Stat Constitution

	// Armes

	Arsenal.GetInstance().hache,

	// équipement

	null
	);

	// création du 3ème ennemie, Le ruser qui est un Elfe

	Ennemi leRuser = new Ennemi("Le rusé",

	// Les races

	ToutesLesRaces.GetInstance().elfe,

	// Classe

	ToutesLesClasses.GetInstance().mage,

	3, // Niveau

	3, // Vie

	3,// mana

	new StatistiqueBonus(2),// Stat Force
	new StatistiqueBonus(5),// Stat Intelligence
	new StatistiqueBonus(3),// Stat Agilite
	new StatistiqueBonus(3),// Stat Dexterite
	new StatistiqueBonus(4), // Stat Constitution

	// Armes

	Arsenal.GetInstance().dague,

	// équipement

	null
	);

	// création du 4ème ennemie,  qui est un humain Flècheur

	Ennemi flecheur = new Ennemi("Flècheur",

	// Les races

	ToutesLesRaces.GetInstance().humain,

	// Classe

	ToutesLesClasses.GetInstance().archer,

	1, // Niveau

	1, // Vie

	2,// mana

	new StatistiqueBonus(2),// Stat Force
	new StatistiqueBonus(5),// Stat Intelligence
	new StatistiqueBonus(5),// Stat Agilite
	new StatistiqueBonus(3),// Stat Dexterite
	new StatistiqueBonus(4), // Stat Constitution

	// Armes

	Arsenal.GetInstance().arc,

	// équipement

	null
	);

	// création du 5ème ennemie, Le ptit gars qui est un nain

	Ennemi lePtitGars = new Ennemi("Le ptit gars",

	// Les races

	ToutesLesRaces.GetInstance().nain,

	// Classe

	ToutesLesClasses.GetInstance().guerrier,

	1, // Niveau

	1, // Vie

	2,// mana

	new StatistiqueBonus(2),// Stat Force
	new StatistiqueBonus(2),// Stat Intelligence
	new StatistiqueBonus(2),// Stat Agilite
	new StatistiqueBonus(2),// Stat Dexterite
	new StatistiqueBonus(1), // Stat Constitution

	// Armes

	Arsenal.GetInstance().masse,

	// équipement

	null
	);

	// Getters :

	public Ennemi GetBruno() {
		return bruno;
	}

	public Ennemi GetFlecheur() {
		return flecheur;
	}

	public Ennemi GetLePtitGars() {
		return lePtitGars;
	}

	public Ennemi GetLeRater() {
		return leRater;
	}

	public Ennemi GetLeRuser() {
		return leRuser;
	}


	// Setters :


	public static void SetInstance(proto.TousLesEnnemis _instance) {
		TousLesEnnemis.instance = _instance;
	}

	public void SetBruno(Ennemi _bruno) {
		bruno = _bruno;
	}

	public void SetFlecheur(Ennemi _flecheur) {
		flecheur = _flecheur;
	}

	public void SetLePtitGars(Ennemi _lePtitGars) {
		lePtitGars = _lePtitGars;
	}

	public void SetLeRater(Ennemi _leRater) {
		leRater = _leRater;
	}

	public void SetLeRuser(Ennemi _leRuser) {
		leRuser = _leRuser;
	}
}