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
    private Agilite agilite;
    private Constitution constitution;
    private Dexterite dexterite;
    private Force force;
    private Intelligence intelligence;

    // constructeur
    public Race(String _nom, Agilite _agilite, Constitution _constitution, Dexterite _dexterite, Force _force,
            Intelligence _intelligence) {
        nom = _nom;
        agilite = _agilite;
        constitution = _constitution;
        dexterite = _dexterite;
        force = _force;
        intelligence = _intelligence;
    }
    // Getters

    public String GetNom() {
        return nom;
    }

    public Agilite GetAgilite() {
        return agilite;
    }

    public Constitution GetConstitution() {
        return constitution;
    }

    public Dexterite GetDexterite() {
        return dexterite;
    }

    public Force GetForce() {
        return force;
    }

    public Intelligence GetIntelligence() {
        return intelligence;
    }

    // Setters

    public void SetNom(String _nom) {
        nom = _nom;
    }

    public void SetAgilite(Agilite _agilite) {
        agilite = _agilite;
    }

    public void SetConstitution(Constitution _constitution) {
        constitution = _constitution;
    }

    public void SetDexterite(Dexterite _dexterite) {
        dexterite = _dexterite;
    }

    public void SetForce(Force _force) {
        force = _force;
    }

    public void SetIntelligence(Intelligence _intelligence) {
        intelligence = _intelligence;
    }
}