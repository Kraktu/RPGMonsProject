package proto;
/**
 * Challenge  Créé par Bruno
  */
/*
  string name, description, defaultChoice;
string[] possibleChoices, malusType, rewardType;
Stat[] neededStat;
int level,flatXPgiven,bonusXPPerLevel;

int[] malusValue, rewardValue;

Equipement[] possibleLoot;
*/

import proto.Stat.Statistique;

public class Challenge {

	// Propriétés :

	protected String nom,description,choixParDefaut;

	// Tableaux de String

	protected String[] choixPossible = new String[1];

	protected String[] typeDeMalus = new String[1];

	protected String[] typeDeRecompense = new String[1];

	protected Statistique StatRequise;

	protected int niveau,experienceBrute,experienceBonusParNiveau;

	// Tableaux d'int

	protected int[] valeurMalus = new int[1];

	protected int[] valeurRecompense = new int[1];

	protected Equipement equipement;

	// Constructeur :

	public Challenge(String _nom, String _description, String _choixParDefaut, String[] _choixPossible, String[] _typeDeMalus, String[] _typeDeRecompense, Statistique _statRequise, int _niveau, int _experienceBrute, int _experienceBonusParNiveau, int[] _valeurMalus, int[] _valeurRecompense, Equipement _equipement) {
		nom = _nom;
		description = _description;
		choixParDefaut = _choixParDefaut;
		choixPossible = _choixPossible;
		typeDeMalus = _typeDeMalus;
		typeDeRecompense = _typeDeRecompense;
		StatRequise = _statRequise;
		niveau = _niveau;
		experienceBrute = _experienceBrute;
		experienceBonusParNiveau = _experienceBonusParNiveau;
		valeurMalus = _valeurMalus;
		valeurRecompense = _valeurRecompense;

		equipement = _equipement;
	}

	// Getters :


	public String GetNom() {
		return nom;
	}

	public String GetDescription() {
		return description;
	}

	public String GetChoixParDefaut() {
		return choixParDefaut;
	}

	public String[] GetChoixPossible() {
		return choixPossible;
	}

	public String[] GetTypeDeMalus() {
		return typeDeMalus;
	}

	public String[] GetTypeDeRecompense() {
		return typeDeRecompense;
	}

	public Statistique GetStatRequise() {
		return StatRequise;
	}

	public int GetNiveau() {
		return niveau;
	}

	public int GetExperienceBrute() {
		return experienceBrute;
	}

	public int GetExperienceBonusParNiveau() {
		return experienceBonusParNiveau;
	}

	public int[] GetValeurMalus() {
		return valeurMalus;
	}

	public int[] GetValeurRecompense() {
		return valeurRecompense;
	}

	public Equipement GetEquipement() {
		return equipement;
	}

	// Setters :


	public void SetNom(String _nom) {
		nom = _nom;
	}

	public void SetDescription(String _description) {
		description = _description;
	}

	public void SetChoixParDefaut(String _choixParDefaut) {
		choixParDefaut = _choixParDefaut;
	}

	public void SetChoixPossible(String[] _choixPossible) {
		choixPossible = _choixPossible;
	}

	public void SetTypeDeMalus(String[] _typeDeMalus) {
		typeDeMalus = _typeDeMalus;
	}

	public void SetTypeDeRecompense(String[] _typeDeRecompense) {
		typeDeRecompense = _typeDeRecompense;
	}

	public void SetStatRequise(Statistique _statRequise) {
		StatRequise = _statRequise;
	}

	public void SetNiveau(int _niveau) {
		niveau = _niveau;
	}

	public void SetExperienceBrute(int _experienceBrute) {
		experienceBrute = _experienceBrute;
	}

	public void SetExperienceBonusParNiveau(int _experienceBonusParNiveau) {
		experienceBonusParNiveau = _experienceBonusParNiveau;
	}

	public void SetValeurMalus(int[] _valeurMalus) {
		valeurMalus = _valeurMalus;
	}

	public void SetValeurRecompense(int[] _valeurRecompense) {
		valeurRecompense = _valeurRecompense;
	}

	public void SetEquipement(Equipement _equipement) {
		equipement = _equipement;
	}

	// Override :


	@Override
	public String toString() {
		return "Challenge{" +
				"nom='" + nom + '\'' +
				", description='" + description + '\'' +
				", choixParDefaut='" + choixParDefaut + '\'' +
				", choixPossible=" + java.util.Arrays.toString(choixPossible) +
				", typeDeMalus=" + java.util.Arrays.toString(typeDeMalus) +
				", typeDeRecompense=" + java.util.Arrays.toString(typeDeRecompense) +
				", StatRequise=" + StatRequise +
				", niveau=" + niveau +
				", experienceBrute=" + experienceBrute +
				", experienceBonusParNiveau=" + experienceBonusParNiveau +
				", valeurMalus=" + java.util.Arrays.toString(valeurMalus) +
				", valeurRecompense=" + java.util.Arrays.toString(valeurRecompense) +
				", equipement=" + equipement +
				'}';
	}

	@Override

	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		if (!super.equals(object)) return false;
		Challenge challenge = (Challenge) object;
		return niveau == challenge.niveau && experienceBrute == challenge.experienceBrute && experienceBonusParNiveau == challenge.experienceBonusParNiveau && java.util.Objects.equals(nom, challenge.nom) && java.util.Objects.equals(description, challenge.description) && java.util.Objects.equals(choixParDefaut, challenge.choixParDefaut) && java.util.Arrays.equals(choixPossible, challenge.choixPossible) && java.util.Arrays.equals(typeDeMalus, challenge.typeDeMalus) && java.util.Arrays.equals(typeDeRecompense, challenge.typeDeRecompense) && java.util.Objects.equals(StatRequise, challenge.StatRequise) && java.util.Arrays.equals(valeurMalus, challenge.valeurMalus) && java.util.Arrays.equals(valeurRecompense, challenge.valeurRecompense) && java.util.Objects.equals(equipement, challenge.equipement);
	}
}