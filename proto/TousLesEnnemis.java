package proto;

import proto.Classes.Classe;
import proto.Classes.ToutesLesClasses;
import proto.Fonctions.EntreUtilisateur;
import proto.Fonctions.MathFonction;
import proto.Race.Race;
import proto.Race.ToutesLesRaces;
import proto.Stat.StatistiqueBonus;

/**
 * TousLesEnnemis Créé par Bruno
 * Base de données des ennemis
 */

public final class TousLesEnnemis {

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

	private Ennemi bruno = new Ennemi("Bruno",

			// Les races

			ToutesLesRaces.GetInstance().GetHumain(),

			// Classe

			ToutesLesClasses.GetInstance().GetVoleur(),

			1, // Niveau

			3, // Vie

			2, // mana

			new StatistiqueBonus(2), // Stat Force
			new StatistiqueBonus(5), // Stat Intelligence
			new StatistiqueBonus(5), // Stat Agilite
			new StatistiqueBonus(3), // Stat Dexterite
			new StatistiqueBonus(4), // Stat Constitution

			// Armes

			ToutesLesArmes.GetInstance().dague,

			// équipement

			null);

	// création du 2ème ennemi le rater qui est un gobelin,

	private Ennemi leRater = new Ennemi("Le raté",

			// Les races

			ToutesLesRaces.GetInstance().GetGobelin(),

			// Classe

			ToutesLesClasses.GetInstance().GetGuerrier(),

			1, // Niveau

			3, // Vie

			2, // mana

			new StatistiqueBonus(5), // Stat Force
			new StatistiqueBonus(1), // Stat Intelligence
			new StatistiqueBonus(1), // Stat Agilite
			new StatistiqueBonus(2), // Stat Dexterite
			new StatistiqueBonus(3), // Stat Constitution

			// Armes

			ToutesLesArmes.GetInstance().hache,

			// équipement

			null);

	// création du 3ème ennemie, Le ruser qui est un Elfe

	private Ennemi leRuser = new Ennemi("Le rusé",

			// Les races

			ToutesLesRaces.GetInstance().GetElfe(),

			// Classe

			ToutesLesClasses.GetInstance().GetMage(),

			3, // Niveau

			3, // Vie

			3, // mana

			new StatistiqueBonus(2), // Stat Force
			new StatistiqueBonus(5), // Stat Intelligence
			new StatistiqueBonus(3), // Stat Agilite
			new StatistiqueBonus(3), // Stat Dexterite
			new StatistiqueBonus(4), // Stat Constitution

			// Armes

			ToutesLesArmes.GetInstance().dague,

			// équipement

			null);

	// création du 4ème ennemie, qui est un humain Flècheur

	private Ennemi flecheur = new Ennemi("Flècheur",

			// Les races

			ToutesLesRaces.GetInstance().GetHumain(),

			// Classe

			ToutesLesClasses.GetInstance().GetArcher(),

			1, // Niveau

			3, // Vie

			2, // mana

			new StatistiqueBonus(2), // Stat Force
			new StatistiqueBonus(5), // Stat Intelligence
			new StatistiqueBonus(5), // Stat Agilite
			new StatistiqueBonus(3), // Stat Dexterite
			new StatistiqueBonus(4), // Stat Constitution

			// Armes

			ToutesLesArmes.GetInstance().arc,

			// équipement

			null);

	// création du 5ème ennemie, Le ptit gars qui est un nain

	private Ennemi lePtitGars = new Ennemi("Le ptit gars",

			// Les races

			ToutesLesRaces.GetInstance().GetNain(),

			// Classe

			ToutesLesClasses.GetInstance().GetGuerrier(),

			1, // Niveau

			3, // Vie

			2, // mana

			new StatistiqueBonus(2), // Stat Force
			new StatistiqueBonus(2), // Stat Intelligence
			new StatistiqueBonus(2), // Stat Agilite
			new StatistiqueBonus(2), // Stat Dexterite
			new StatistiqueBonus(1), // Stat Constitution

			// Armes

			ToutesLesArmes.GetInstance().masse,

			// équipement

			null);

	// tableau de tous les ennemis
	Ennemi[] tableauTousLesEnnemis = { bruno, leRater, leRuser, flecheur, lePtitGars };

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

	public Ennemi[] GetTableauTousLesEnnemis() {
		return tableauTousLesEnnemis;
	}

	public Ennemi[] TableauTousLesEnnemis() {
		return tableauTousLesEnnemis;
	}
	// Setters :

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

	public void SetTableauTousLesEnnemis(Ennemi[] _tableauTousLesEnnemis) {
		tableauTousLesEnnemis = _tableauTousLesEnnemis;
	}

	// Methodes.

	public Ennemi GenererEnnemiAleatoire(){

		Race ennemiRaceAleatoire = EnnemiRaceAleatoire();
		Classe ennemiClasseAleatoire = EnnemiClasseAleatoire();

		Ennemi ennemiAleatoire = new Ennemi(EnnemiNomAleatoire(), ennemiRaceAleatoire, ennemiClasseAleatoire, EnnemiNiveauAleatoire(), EnnemiPVAleatoire(), EnnemiManaAleatoire(), EnnemiStatBonusAleatoire(), EnnemiStatBonusAleatoire(), EnnemiStatBonusAleatoire(), EnnemiStatBonusAleatoire(), EnnemiStatBonusAleatoire(), null, null);

		return ennemiAleatoire;

	}

	private EntreUtilisateur entreUtilisateur = ToutesLesFonctions.GetInstance().GetEntreUtilisateur();
	private MathFonction mathFonction = ToutesLesFonctions.GetInstance().GetMathFonction();

	private String EnnemiNomAleatoire(){

		String[] _ennemiNomTableau = {
			"Ennemi aléatoire A",
			"Ennemi aléatoire B",
			"Ennemi aléatoire C",
			"Ennemi aléatoire D",
			"Ennemi aléatoire E"
		};

		int _nbrAleatoire = mathFonction.NbrAleatoireEntreDeuxValeur(0, _ennemiNomTableau.length - 1);

		return _ennemiNomTableau[_nbrAleatoire];

	}

	private Race EnnemiRaceAleatoire(){

		int _nbrAleatoire = mathFonction.NbrAleatoireEntreDeuxValeur(0, ToutesLesRaces.GetInstance().TableauToutesLesRaces().length - 1);

		return ToutesLesRaces.GetInstance().TableauToutesLesRaces()[_nbrAleatoire];

	}

	private Classe EnnemiClasseAleatoire(){

		int _nbrAleatoire = entreUtilisateur.JetDeDeMax(ToutesLesClasses.GetInstance().TableauToutesLesClasses().length - 1);

		return ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_nbrAleatoire];

	}

	private int EnnemiNiveauAleatoire(){
		/**
		* Cette fonction va chercher le niveau du joueur stocké dans le fichier lesPersonnagesEnCombats.
		* Ensuite, cette valeur va varier positivement ou négativement grace à une variable int appelé variance.
		* Par exemple : si le joueur est niveau 5, et la valeur de variance est de 3,
		* le niveau de l'ennemi sera compris entre 2 et 8.
		*/

		ToutesLesFonctions fonctions = ToutesLesFonctions.GetInstance();

		final int variance = 3;

		int joueurNiveau = fonctions.GetLesPersonnagesEnCombat().GetLePersonnageJouable().GetNiveau();

		int ennemiNiveau = fonctions.GetMathFonction().NbrAleatoireEntreDeuxValeur(joueurNiveau - variance, joueurNiveau + variance);

		if (ennemiNiveau < 1) {

			ennemiNiveau = 1;

		}

		return ennemiNiveau;

	}

	private int EnnemiPVAleatoire(){

		ToutesLesFonctions fonctions = ToutesLesFonctions.GetInstance();

		final int _variance = 1;

		int _ennemiPV = fonctions.GetMathFonction().NbrAleatoireEntreDeuxValeur(-_variance, _variance);

		return _ennemiPV;

	}

	private int EnnemiManaAleatoire(){

		ToutesLesFonctions fonctions = ToutesLesFonctions.GetInstance();

		final int _variance = 5;

		int _baseMana = 10;

		int _ennemiMana = fonctions.GetMathFonction().NbrAleatoireEntreDeuxValeur(_baseMana - _variance, _baseMana + _variance);

		return _ennemiMana;

	}

	private StatistiqueBonus EnnemiStatBonusAleatoire(){

		ToutesLesFonctions fonctions = ToutesLesFonctions.GetInstance();

		return new StatistiqueBonus(5 + fonctions.GetMathFonction().NbrAleatoireEntreDeuxValeur(-2,2));
		
	}

}