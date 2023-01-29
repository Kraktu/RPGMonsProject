package proto;

import java.util.ArrayList;
import java.util.List;

import proto.Stat.StatistiqueBonus;
/**
 * Challenge  Créé par Bruno.
  */

public class Challenge {

	// Propriétés :

	protected String nom,description,choixParDefaut;

	// Liste de String

	protected List<String> choixPossible = new ArrayList<String>();

	protected List <String> typeDeMalus = new ArrayList<String>();

	protected List <String> typeDeRecompense = new ArrayList<String>();

	protected StatistiqueBonus forceBonus;

	protected StatistiqueBonus intelligenceBonus;

	protected StatistiqueBonus agiliteBonus;

	protected StatistiqueBonus dexteriteBonus;

	protected StatistiqueBonus constitutionBonus;

	protected int niveau,experienceBrute,experienceBonusParNiveau;

	// Tableaux d'int

	protected int[] valeurMalus = new int[3];

	protected int[] valeurRecompense = new int[3];

	protected Equipement equipement;

	// Constructeur :

	public Challenge(String _nom, String _description, String _choixParDefaut, List<String> _choixPossible, List<String> _typeDeMalus, List<String> _typeDeRecompense, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _dexteriteBonus, StatistiqueBonus _constitutionBonus, int _niveau, int _experienceBrute, int _experienceBonusParNiveau, int[] _valeurMalus, int[] _valeurRecompense, Equipement _equipement) {

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

	public List<String> GetChoixPossible() {
		return choixPossible;
	}

	public List<String> GetTypeDeMalus() {
		return typeDeMalus;
	}

	public List<String> GetTypeDeRecompense() {
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

	public void SetChoixPossible(List<String> _choixPossible) {
		choixPossible = _choixPossible;
	}

	public void SetTypeDeMalus(List<String> _typeDeMalus) {
		typeDeMalus = _typeDeMalus;
	}

	public void SetTypeDeRecompense(List<String> _typeDeRecompense) {
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
}