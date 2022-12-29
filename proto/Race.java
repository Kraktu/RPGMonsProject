package proto;

/**
 * Race, fait par Seb
 */

// Les différentes races = Humain, Elfe, Nain, Troll, Gobelin.
// propriétés
// string name
// string background
// Stat strengthModifier
// Stat intelligenceModifier
// Stat agilityModifier
// Stat dexterityModifier
// Stat constitutionModifier;

public class Race {

    // propriete
    private String nom;
    private String description;
    private StatistiqueBonus forceBonus;
    private StatistiqueBonus intelligenceBonus;
    private StatistiqueBonus agiliteBonus;
    private StatistiqueBonus dexteriteBonus;
    private StatistiqueBonus constitutionBonus;

    // constructeur
    public Race(String _nom, String _description, StatistiqueBonus _forceBonus, StatistiqueBonus _intelligenceBonus, StatistiqueBonus _agiliteBonus, StatistiqueBonus _dexteriteBonus, StatistiqueBonus _constitutionBonus) {

        nom = _nom;
        description = _description;

        forceBonus = _forceBonus;
        intelligenceBonus = _intelligenceBonus;
        agiliteBonus = _agiliteBonus;
        dexteriteBonus = _dexteriteBonus;
        constitutionBonus = _constitutionBonus;
    }

    // Getters

    public String GetNom() {
        return nom;
    }

    public String GetDescription() {
        return description;
    }

    public StatistiqueBonus GetforceBonus() {
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

    // Setters

    public void SetNom(String _nom) {
        nom = _nom;
    }

    public void SetDescription(String _description) {
        description = _description;
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

}