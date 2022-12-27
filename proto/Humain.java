package proto;
/**
 * Humain, créer par Seb
 */
public class Humain extends Race {
// Proprietes
    private String nom;
    private String description;
    private ForceBonus forceBonus;

    // constructeur

    public Humain(String _nom, Agilite _agilite, Constitution _constitution, Dexterite _dexterite, Force _force, Intelligence _intelligence, String nom, String description, ForceBonus forceBonus) {
        super("Humain", 5, 5, 5, 5, 5);
        nom = _nom;
        description = _description;
        forceBonus = _forceBonus;
    }


// Getters


    public String GetNom() {
        return nom;
    }

    public String GetDescription() {
        return description;
    }

    public ForceBonus GetForceBonus() {
        return forceBonus;
    }

    // Setters


    public void SetNom(String _nom) {
        nom = _nom;
    }

    public void SetDescription(String _description) {
        description = _description;
    }

    public void SetForceBonus(ForceBonus _forceBonus) {
        forceBonus = _forceBonus;
    }
}
