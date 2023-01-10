package proto;

import proto.Stat.StatistiqueBonus;
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
public class Challenge {

	// Propriétés :

	protected String nom,description,choixParDefaut;

	// Tableaux de String

	protected String[] choixPossible = new String[3];

	protected String[] typeDeMalus = new String[1];

	protected String[] typeDeRecompense = new String[1];

	protected StatistiqueBonus forceBonus;

	protected StatistiqueBonus intelligenceBonus;

	protected StatistiqueBonus agiliteBonus;

	protected StatistiqueBonus dexteriteBonus;

	protected StatistiqueBonus constitutionBonus;

	protected int niveau,experienceBrute,experienceBonusParNiveau;

	// Tableaux d'int

	protected int[] valeurMalus = new int[1];

	protected int[] valeurRecompense = new int[1];

	protected Equipement equipement;

	// Constructeur :

	public Challenge(String _nom, String _description, String _choixParDefaut, String[] _choixPossible, String[] _typeDeMalus, String[] _typeDeRecompense, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _dexteriteBonus, StatistiqueBonus _constitutionBonus, int _niveau, int _experienceBrute, int _experienceBonusParNiveau, int[] _valeurMalus, int[] _valeurRecompense, Equipement _equipement) {
		nom = _nom;
		description = _description;
		choixParDefaut = _choixParDefaut;
		choixPossible = _choixPossible;
		typeDeMalus = _typeDeMalus;
		typeDeRecompense = _typeDeRecompense;
		forceBonus = _forceBonus;
		intelligenceBonus = _intelligenceBonus;
		agiliteBonus = _agiliteBonus;
		dexteriteBonus = _dexteriteBonus;
		constitutionBonus = _constitutionBonus;
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

	public StatistiqueBonus GetForceBonus() {
		return forceBonus;
	}

	public StatistiqueBonus GetIntelligenceBonus() {
		return intelligenceBonus;
	}

	public StatistiqueBonus GetAgiliteBonus() {
		return agiliteBonus;
	}

	public StatistiqueBonus GetDexteriteBonus() {
		return dexteriteBonus;
	}

	public StatistiqueBonus GetConstitutionBonus() {
		return constitutionBonus;
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

	public void SetForceBonus(StatistiqueBonus _forceBonus) {
		forceBonus = _forceBonus;
	}

	public void SetIntelligenceBonus(StatistiqueBonus _intelligenceBonus) {
		intelligenceBonus = _intelligenceBonus;
	}

	public void SetAgiliteBonus(StatistiqueBonus _agiliteBonus) {
		agiliteBonus = _agiliteBonus;
	}

	public void SetDexteriteBonus(StatistiqueBonus _dexteriteBonus) {
		dexteriteBonus = _dexteriteBonus;
	}

	public void SetConstitutionBonus(StatistiqueBonus _constitutionBonus) {
		constitutionBonus = _constitutionBonus;
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
				", typeDeRecompense=" + java.util.Arrays.toString(valeurRecompense) +
				", forceBonus=" + forceBonus +
				", intelligenceBonus=" + intelligenceBonus +
				", agiliteBonus=" + agiliteBonus +
				", dexteriteBonus=" + dexteriteBonus +
				", constitutionBonus=" + constitutionBonus +
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
		return niveau == challenge.niveau && experienceBrute == challenge.experienceBrute && experienceBonusParNiveau == challenge.experienceBonusParNiveau && java.util.Objects.equals(nom, challenge.nom) && java.util.Objects.equals(description, challenge.description) && java.util.Objects.equals(choixParDefaut, challenge.choixParDefaut) && java.util.Arrays.equals(choixPossible, challenge.choixPossible) && java.util.Arrays.equals(typeDeMalus, challenge.typeDeMalus) && java.util.Arrays.equals(typeDeRecompense, challenge.typeDeRecompense) && java.util.Objects.equals(forceBonus, challenge.forceBonus) && java.util.Objects.equals(intelligenceBonus, challenge.intelligenceBonus) && java.util.Objects.equals(agiliteBonus, challenge.agiliteBonus) && java.util.Objects.equals(dexteriteBonus, challenge.dexteriteBonus) && java.util.Objects.equals(constitutionBonus, challenge.constitutionBonus) && java.util.Arrays.equals(valeurMalus, challenge.valeurMalus) && java.util.Arrays.equals(valeurRecompense, challenge.valeurRecompense) && java.util.Objects.equals(equipement, challenge.equipement);
	}

	public int hashCode() {
		int result = java.util.Objects.hash(super.hashCode(), experienceBonusParNiveau, equipement);
		result = 31 * result + java.util.Arrays.hashCode(valeurMalus);
		result = 31 * result + java.util.Arrays.hashCode(valeurRecompense);
		return result;
	}
}