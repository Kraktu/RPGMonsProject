package proto;

import proto.Classes.Classe;
import proto.Classes.ToutesLesClasses;
import proto.Fonctions.EntreUtilisateur;
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

		Ennemi ennemiAleatoire = new Ennemi(EnnemiNomAleatoire(), EnnemiRaceAleatoire(), EnnemiClasseAleatoire(), 0, 0, 0, null, null, null, null, null, null, null);

		return ennemiAleatoire;

	}

	private EntreUtilisateur entreUtilisateur = ToutesLesFonctions.GetInstance().GetEntreUtilisateur();

	private String EnnemiNomAleatoire(){

		String[] _ennemiNomTableau = {
			"Ennemi aléatoire A",
			"Ennemi aléatoire B",
			"Ennemi aléatoire C",
			"Ennemi aléatoire D",
			"Ennemi aléatoire E"
		};

		int _nbrAleatoire = entreUtilisateur.JetDeDeMax(_ennemiNomTableau.length - 1);

		return _ennemiNomTableau[_nbrAleatoire];

	}

	private Race EnnemiRaceAleatoire(){

		int _nbrAleatoire = entreUtilisateur.JetDeDeMax(ToutesLesRaces.GetInstance().TableauToutesLesRaces().length - 1);

		return ToutesLesRaces.GetInstance().TableauToutesLesRaces()[_nbrAleatoire];

	}

	private Classe EnnemiClasseAleatoire(){

		int _nbrAleatoire = entreUtilisateur.JetDeDeMax(ToutesLesClasses.GetInstance().TableauToutesLesClasses().length - 1);

		return ToutesLesClasses.GetInstance().TableauToutesLesClasses()[_nbrAleatoire];

	}

}